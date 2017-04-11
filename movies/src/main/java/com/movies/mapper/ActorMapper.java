package com.movies.mapper;

import com.movies.domain.Actor;
import org.apache.ibatis.annotations.Select;
import java.util.ArrayList;

public interface ActorMapper {
    @Select("SELECT first_name, last_name FROM actor WHERE id=#{id}")
    Actor findActorById(Integer id);

    @Select("SELECT first_name, last_name FROM actor WHERE id=#{id}")
    ArrayList<Actor> getAllActors();
}