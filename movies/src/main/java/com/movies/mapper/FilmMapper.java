package com.movies.mapper;

import org.apache.catalina.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public interface FilmMapper {
    @Select("SELECT title, description, release_year, rating FROM film WHERE id=#{id}")
    User findFilmById(Integer id);
}