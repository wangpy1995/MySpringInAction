package com.springinaction.springidol;

/**
 * Created by yiben on 2015/11/2.
 */
public class Volunteer implements Thinker {

    private String thoughts;

    @Override
    public void thinkOfSomething(String thoughts) {

        this.thoughts = thoughts;
    }

    public String getThoughts() {
        return thoughts;
    }
}
