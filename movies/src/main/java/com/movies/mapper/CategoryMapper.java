package com.movies.mapper;

import com.movies.domain.Category;
import org.apache.ibatis.annotations.Select;

public interface CategoryMapper {
    @Select("SELECT name FROM category WHERE id=#{id}")
    Category findCategoryById(Integer id);
}