package com.springinaction.springidol;

/**
 * ������(������������bean)
 * <p/>
 * Created by yiben on 2015/10/28.
 */
public class Stage {

    private Stage() {
    }

    public static Stage getInstance() {

        return StageSingletonHolder.instance;
    }

    private static class StageSingletonHolder {

        static Stage instance = new Stage();
    }
}
