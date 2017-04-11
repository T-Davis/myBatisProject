package com.movies.mapper;

import com.movies.domain.Film;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public interface FilmMapper {
    @Select("SELECT title, description, release_year, rating FROM film WHERE id=#{id}")
    Film findFilmById(Integer id);

    ArrayList<Film> getAllFilms();
}