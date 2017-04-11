package com.movies.mapper;

import com.movies.domain.Category;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public interface CategoryMapper {
    @Select("SELECT name FROM category WHERE id=#{id}")
    Category findCategoryById(Integer id);

    // add sql query
    ArrayList<Category> getAllCategories();
}