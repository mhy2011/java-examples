package com.mhy.proxy.basic;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author mahaiyuan
 * @ClassName: ProxySubjectTest
 * @date 2018-09-25 下午9:03
 */
public class ProxySubjectTest {

    @Test
    public void testRequest() throws Exception {
        Subject subject = new ProxySubject();
        subject.request();
    }
}