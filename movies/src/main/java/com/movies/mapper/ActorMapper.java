package com.movies.mapper;

import com.movies.domain.Actor;
import org.apache.ibatis.annotations.Select;
<<<<<<< HEAD
import org.springframework.stereotype.Service;

=======
>>>>>>> 15246b22bd480d17f7e75fff51f93b6fbe0192de
import java.util.ArrayList;

@Service
public interface ActorMapper {
    @Select("SELECT first_name, last_name FROM actor WHERE id=#{id}")
    Actor findActorById(Integer id);

    @Select("SELECT first_name, last_name FROM actor WHERE id=#{id}")
    ArrayList<Actor> getAllActors();
}