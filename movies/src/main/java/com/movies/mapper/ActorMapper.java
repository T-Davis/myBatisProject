package com.movies.mapper;

import org.apache.catalina.User;
import org.apache.ibatis.annotations.Select;

public interface ActorMapper {
    @Select("SELECT first_name, last_name FROM actor WHERE id=#{id}")
    User findActorById(Integer id);
}