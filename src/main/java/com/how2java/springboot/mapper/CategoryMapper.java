package com.how2java.springboot.mapper;

import com.how2java.springboot.pojo.Category;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CategoryMapper {

    List<Category> findAll();
}
