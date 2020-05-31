package com.how2java.springboot.controller;

import com.how2java.springboot.dao.CategoryDao;
import com.how2java.springboot.pojo.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class categoryController {

    @Autowired
    CategoryDao categoryDao;

    @RequestMapping("/listCategory")
    public String listCategory(Model m) throws Exception {
        List<Category> cs = categoryDao.findAll();

        m.addAttribute("cs",cs);

        return "listCategory";
    }
}
