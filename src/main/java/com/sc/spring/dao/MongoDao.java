package com.sc.spring.dao;

import com.sc.spring.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;

import java.util.List;

/**
 * 类名：MongoDao
 * 描述：一段话描述类的信息
 * 作者：劫恋李
 * 日期：2020/11/17 11:16
 * 版本：V1.0
 */
public class MongoDao {
    @Autowired
    MongoTemplate mongoTemplate;
    public List<Book> select(){
        List<Book> list=(List<Book>) mongoTemplate.findAll(Book.class);
        return list;
    }
}
