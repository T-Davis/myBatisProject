package com.movies.resources;

import java.util.ArrayList;

import com.movies.domain.Actor;
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

}

