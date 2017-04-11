package com.movies.mapper;

import org.apache.catalina.User;
import org.apache.ibatis.annotations.Select;

public interface CategoryMapper {
    @Select("SELECT name FROM category WHERE id=#{id}")
    User findCategoryById(Integer id);
}