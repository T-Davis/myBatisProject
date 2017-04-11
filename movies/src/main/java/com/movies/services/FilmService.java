package com.movies.services;

import com.movies.domain.Actor;
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

    public ArrayList<Actor> getAllActors(){
        return actorMapper.getAllActors();
    }

}
