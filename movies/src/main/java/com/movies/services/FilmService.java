package com.movies.services;

import com.movies.domain.Actor;
import com.movies.domain.Film;
import com.movies.domain.Category;
import com.movies.mapper.ActorMapper;
import com.movies.mapper.FilmMapper;
import com.movies.mapper.CategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * Created by ryandesmond on 4/11/17.
 */
@Service
public class FilmService {

    @Autowired
    FilmMapper filmMapper;

    @Autowired
    ActorMapper actorMapper;

    @Autowired
    CategoryMapper categoryMapper;

    public ArrayList<Actor> getAllActors() {
        return actorMapper.getAllActors();

    }

    public ArrayList<Film> getAllFilms() {
        return filmMapper.getAllFilms();
    }

    public ArrayList<Category> getAllCategories(){
        return categoryMapper.getAllCategories();
    }
}
