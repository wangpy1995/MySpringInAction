package com.springinaction.springidol;

import com.springinaction.exception.PerformanceException;

/**
 * Created by yiben on 2015/10/28.
 */
public class PoieticJuggler extends Juggler {

    private Poem poem;

    public PoieticJuggler() {

    }

    public PoieticJuggler(Poem poem) {
        super();
        this.poem = poem;
    }

    public PoieticJuggler(int beanBags, Poem poem) {

        super(beanBags);
        this.poem = poem;
    }

    public void perform() throws PerformanceException {

        super.perform();
        System.out.println("While reciting...");
        poem.recite();
    }

}
