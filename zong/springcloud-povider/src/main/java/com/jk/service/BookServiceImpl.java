package com.jk.service;


import com.jk.dao.BookDao;
import com.jk.entity.BookEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class BookServiceImpl {

    @Autowired
    private BookDao bookDao;

    public Map getliebiao(BookEntity arr) {
        arr.setKaishi((arr.getPage()-1)*arr.getRows());
        arr.setJieshu(arr.getRows());
        List<BookEntity> list=bookDao.getliebiao(arr);
        int shu=bookDao.count(arr);
        Map map=new HashMap();
        map.put("total",shu);
        map.put("rows",list);
        return map;
    }

    public void add(BookEntity arr) {
        if (arr.getId() == null) {
            bookDao.add(arr);
        }else {
            bookDao.update(arr);
        }

    }

    public void delete(Integer id) {
        bookDao.delete(id);
    }

    public BookEntity huixian(Integer id) {
        return bookDao.huixian(id);
    }
}
