package com.movies.mapper;

import org.apache.ibatis.annotations.Select;

public interface FilmMapper {
    @Select("SELECT title, description, release_year, rating FROM film WHERE id=#{id}")
    Film findFilmById(Integer id);
}