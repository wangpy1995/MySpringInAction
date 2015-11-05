package com.springinaction.springidol;

import com.springinaction.exception.PerformanceException;

/**
 * 杂技师（默认抛3个豆袋）
 * <p/>
 * Created by yiben on 2015/10/21.
 */
public class Juggler implements Performer {

    private int beanBags;

    public Juggler(int beanBags) {
        this.beanBags = beanBags;
    }

    public Juggler() {

    }

    /**
     * 杂技师一次能抛豆袋个数
     *
     * @throws PerformanceException
     */
    @Override
    public void perform() throws PerformanceException {
        System.out.println("JUGGLING " + beanBags + " BEANBAGS");
    }

}
