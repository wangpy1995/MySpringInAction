package com.springinaction.springidol.annotationIdol;

/**
 * Created by yiben on 2015/10/29.
 */
public class Guitar implements Instrument {


    @Override
    public void play() {
        System.out.println(" bing bing bing");
    }
}
