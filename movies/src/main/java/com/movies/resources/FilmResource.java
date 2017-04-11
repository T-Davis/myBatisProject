package com.movies.resources;

import java.util.ArrayList;

import com.movies.domain.Actor;
import com.movies.domain.Category;
import com.movies.domain.Film;
import com.movies.domain.FilmActor;
import com.movies.domain.FilmCategory;
import com.movies.services.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/movies")
public class FilmResource {

    @Autowired
    FilmService filmService;

    @RequestMapping("/actor")
    public ArrayList<Actor> getAllActors() {

        return filmService.getAllActors();
    }

    @RequestMapping("/category")
    public ArrayList<Category> getAllCategories() {

        return filmService.getAllCategories();

    }

    @RequestMapping("/")
    public ArrayList<Film> getAllFilms() {

        return filmService.getAllFilms();

    }

}

