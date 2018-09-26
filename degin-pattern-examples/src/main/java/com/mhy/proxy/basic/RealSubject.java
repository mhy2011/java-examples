package com.mhy.proxy.basic;

/**
 * @author mahaiyuan
 * @ClassName: RealSubject
 * @date 2018-09-25 下午8:44
 */
public class RealSubject extends Subject {
    @Override
    public void request() {
        System.out.println("RealSubject.request......");
    }
}
