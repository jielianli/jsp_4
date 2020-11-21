package com.sc.spring.entity;

import java.util.Arrays;

/**
 * 类名：Book
 * 描述：一段话描述类的信息
 * 作者：劫恋李
 * 日期：2020/11/17 11:12
 * 版本：V1.0
 */
public class Book {
    private  String title;
    private  String desc;
    private  String by;
    private  String url;
    private  String[] tags;
    private  float likes;

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", desc='" + desc + '\'' +
                ", by='" + by + '\'' +
                ", url='" + url + '\'' +
                ", tags=" + Arrays.toString(tags) +
                ", likes=" + likes +
                '}';
    }

    public String getTitle() {
        return title;
    }
}
