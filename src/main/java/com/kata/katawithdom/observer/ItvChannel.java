package com.kata.katawithdom.observer;

import lombok.Getter;

@Getter
public class ItvChannel implements Channel{

    private String news;
    @Override
    public void update(String news) {
        this.news = news;
    }
}
