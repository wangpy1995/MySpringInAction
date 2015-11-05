package com.springinaction.springidol.annotationIdol;

import org.springframework.beans.factory.annotation.Qualifier;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by yiben on 2015/10/29.
 */
public class InstrumentProxy implements InvocationHandler {

    @Qualifier
    private Object target;

    public static void main(String[] args) {

        InstrumentProxy instrumentProxy = new InstrumentProxy();
        Instrument instrument = (Instrument) instrumentProxy.bind(new Guitar());
        instrument.play();
    }

    /**
     * @param proxy
     * @param method
     * @param args
     * @return
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws InvocationTargetException, IllegalAccessException {

        Object result = null;
        System.out.println("事物开始");
        result = method.invoke(target, args);
        System.out.println("事物结束");
        return result;

    }

    public Object bind(Object target) {
        this.target = target;
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

}
