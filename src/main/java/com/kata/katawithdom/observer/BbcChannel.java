package com.kata.katawithdom.observer;

import lombok.Getter;

@Getter
public class BbcChannel implements Channel{

    private String news;
    @Override
    public void update(String news) {
        this.news = news;
    }
}
