package com.test.controller;

import com.test.entity.Book;
import com.test.service.BookService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@RestController
public class BookController {

    @Resource
    BookService service;

    @Value("${spring.datasource.url}")
    String url;

    @RequestMapping("/book/{bid}")
    Book findBookById(@PathVariable("bid") int bid, HttpServletRequest httpServletRequest){

        System.out.println(httpServletRequest.getHeader("Test"));
        System.out.println(url);

        return service.getBookById(bid);
    }
}