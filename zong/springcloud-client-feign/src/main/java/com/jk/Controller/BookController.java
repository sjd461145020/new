package com.jk.Controller;

import com.jk.entity.BookEntity;
import com.jk.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("getliebiao")
    public Map getliebiao(BookEntity arr){
        return bookService.getliebiao(arr);
    }
    @PutMapping("add")
    private void add(BookEntity arr){
        bookService.add(arr);
    }

    @DeleteMapping("delete")
    public void delete(Integer id){
        bookService.delete(id);
    }

    @GetMapping("huixian")
    public BookEntity huixian(Integer id){
        return bookService.huixian(id);
    }

}
