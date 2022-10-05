package com.kata.katawithdom;

import com.kata.katawithdom.observer.BbcChannel;
import com.kata.katawithdom.observer.ItvChannel;
import com.kata.katawithdom.observer.NewsAgency;
import com.kata.katawithdom.observer.SkyChannel;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ObserverTest {

    NewsAgency newsAgency;

    @BeforeEach
    public void setUp(){
        newsAgency = new NewsAgency();
    }

    @Test
    public void test123(){
        SkyChannel skyChannel = new SkyChannel();
        BbcChannel bbcChannel = new BbcChannel();
        ItvChannel itvChannel = new ItvChannel();
        newsAgency.addObserver(skyChannel);
        newsAgency.addObserver(bbcChannel);
        newsAgency.addObserver(itvChannel);

        newsAgency.updateNews("The Queen has passed away");

        Assertions.assertEquals("The Queen has passed away", skyChannel.getNews());
        Assertions.assertEquals("The Queen has passed away", bbcChannel.getNews());
        Assertions.assertEquals("The Queen has passed away", itvChannel.getNews());
    }
}
