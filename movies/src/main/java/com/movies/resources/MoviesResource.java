package com.movies.resources;

import java.util.ArrayList;

import com.movies.domain.Actor;
import com.movies.domain.Category;
import com.movies.domain.Film;
import com.movies.domain.FilmActor;
import com.movies.domain.FilmCategory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/movies")
public class MoviesResource {

    @RequestMapping("/actor")
    public ArrayList<Actor> getAllActors() {

        ActorDAO actor = new ActorDAO();
        ArrayList<Actor> temp = movies.getAllActors();
        return temp;
    }

    @RequestMapping("/category")
    public ArrayList<Category> getAllCategories() {

        CategoryDAO category = new CategoryDAO();
        ArrayList<Category> temp = movies.getAllCategories();
        return temp;
    }
    @RequestMapping("/film")
    public ArrayList<Film> getAllFilms() {

        FilmDAO movie = new FilmDAO();
        ArrayList<Film> temp = movies.getAllFilms();
        return temp;
    }

    @RequestMapping("/film&actor")
    public ArrayList<FilmActor> getAllFilmsAndActors() {

        FilmDAO movie = new FilmDAO();
        ArrayList<FilmActor> temp = movies.getAllFilmsAndActors();
        return temp;

    }

    @RequestMapping("/film&category")
    public ArrayList<FilmCategory> getAllFilmsAndCategories() {

        FilmDAO movie = new FilmDAO();
        ArrayList<FilmCategory> temp = movies.getAllFilmsAndCategory();
        return temp;

    }

}

