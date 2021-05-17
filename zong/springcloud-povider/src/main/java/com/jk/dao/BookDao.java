package com.jk.dao;

import com.jk.entity.BookEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface BookDao {
    List<BookEntity> getliebiao(BookEntity arr);

    int count(BookEntity arr);

    void add(BookEntity arr);

    void update(BookEntity arr);

    void delete(Integer id);

    BookEntity huixian(Integer id);

}
