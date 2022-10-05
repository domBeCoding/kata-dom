package com.kata.katawithdom.observer;

import java.util.ArrayList;
import java.util.List;

public class NewsAgency {

    String news;
    List<Channel> channels = new ArrayList<>();

    public void addObserver(Channel channel) {
        this.channels.add(channel);
    }

    public void removeObserver(Channel channel) {
        channels.remove(channel);
    }

    public void updateNews(String news) {
        this.news = news;

        for (Channel channel : channels) {
            channel.update(news);
        }


    }
}
