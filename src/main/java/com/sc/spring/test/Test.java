package com.sc.spring.test;

import com.sc.spring.dao.MongoDao;
import com.sc.spring.entity.Book;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

/**
 * 类名：Test
 * 描述：一段话描述类的信息
 * 作者：劫恋李
 * 日期：2020/11/17 11:19
 * 版本：V1.0
 */
public class Test {
    public static void main(String[] args) {
        //注释
        ApplicationContext app=new ClassPathXmlApplicationContext("applicationContext.xml");
        MongoDao dao=(MongoDao) app.getBean("MongoDao");
        List<Book> list= dao.select();
        for (Book book : list) {
            System.out.println(book);
        }
    }
   
    
    

}
