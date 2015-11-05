package com.springinaction.springidol;

/**
 * Created by yiben on 2015/11/2.
 */
public class Magician implements MindReader {
    private String thoughts;

    @Override
    public void interceptThoughts(String thoughts) {

        System.out.println("Intercepting volunteer's thoughts");
        this.thoughts = thoughts;
    }

    @Override
    public String getThoughts() {

        return thoughts;
    }
}
