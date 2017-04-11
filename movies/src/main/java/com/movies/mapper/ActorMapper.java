package com.movies.mapper;

import com.movies.domain.Actor;
import org.apache.ibatis.annotations.Select;

public interface ActorMapper {
    @Select("SELECT first_name, last_name FROM actor WHERE id=#{id}")
    Actor findActorById(Integer id);
}