package com.springinaction.springidol;

/**
 * Created by yiben on 2015/10/28.
 */
public class Ticket {

    public Ticket() {

    }

    public Ticket(Stage stage) {
        System.out.println(stage.getClass().getSimpleName());
    }
}
