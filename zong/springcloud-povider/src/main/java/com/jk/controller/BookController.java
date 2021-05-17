package com.jk.controller;

import com.jk.entity.BookEntity;
import com.jk.service.BookService;
import com.jk.service.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@RestController

public class BookController implements BookService {

    @Autowired
    private BookServiceImpl bookService;

    @Override
    public Map getliebiao(BookEntity arr) {
        return bookService.getliebiao(arr);
    }

    @Override
    public void add(BookEntity arr) {
        bookService.add(arr);
    }

    @Override
    public void delete(Integer id) {
        bookService.delete(id);
    }

    @Override
    public BookEntity huixian(Integer id) {
        return bookService.huixian(id);
    }
}
