package com.springinaction.springidol;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * SpringAOP���
 * Created by yiben on 2015/11/2.
 */
public class Audience {

    public void takeSeats() {
        System.out.println("The Audience is taking their seats");
    }

    public void turnOffCellPhones() {
        System.out.println("The Audience is truning off their phones");
    }

    public void applaud() {
        System.out.println("CLAP CLAP CLAP CLAP");
    }

    public void demandRefund() {
        System.out.println("Boo! We want our money back!");
    }

    public void watchPerformance(ProceedingJoinPoint joinPoint) {

        try {
            System.out.println("The audience is taking their seats");
            System.out.println("The audience is taking off their phone");
            long start = System.currentTimeMillis();

            joinPoint.proceed();        //�൱�ڱ����õķ���ִ��

            long end = System.currentTimeMillis();
            System.out.println("CLAP CLAP CLAP CLAP CLAP");
            System.out.println("The Performance took " + (end - start) + " milliseconds");
        } catch (Throwable t) {
            System.out.println("Boo! We want our money back!");
        }
    }
}
