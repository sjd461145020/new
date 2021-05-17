package com.jk.service;


import com.jk.entity.BookEntity;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.SpringQueryMap;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
@FeignClient(value = "provider")
public interface BookService {

    @GetMapping("getliebiao")
    Map getliebiao(@SpringQueryMap BookEntity arr);

    @PutMapping("add")
    void add(@SpringQueryMap BookEntity arr);

    @DeleteMapping("delete")
    void delete(@RequestParam Integer id);

    @GetMapping("huixian")
    BookEntity huixian(@RequestParam Integer id);
}
