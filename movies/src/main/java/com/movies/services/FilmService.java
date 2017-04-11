package com.movies.services;

import com.movies.domain.Actor;
import com.movies.domain.Category;
import com.movies.mapper.ActorMapper;
import com.movies.mapper.FilmMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;

/**
 * Created by ryandesmond on 4/11/17.
 */
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

    public ArrayList<Actor> getAllFilms() {
        return FilmMapper.getAllFilms();
    }

    public ArrayList<Actor> getAllCategories(){
        return CategoryMapper.getAllCategories();
    }
}
