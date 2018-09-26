package com.mhy.proxy.basic;

/**
 * @author mahaiyuan
 * @ClassName: ProxySubject
 * @date 2018-09-25 下午8:44
 */
public class ProxySubject extends Subject {

    private RealSubject realSubject = new RealSubject();

    @Override
    public void request() {
        beforeRequest();
        realSubject.request();
        afterRequest();
    }
    private void beforeRequest() {
        System.out.println("ProxySubject.beforeRequest......");
    }

    private void afterRequest() {
        System.out.println("ProxySubject.afterRequest......");
    }
}
