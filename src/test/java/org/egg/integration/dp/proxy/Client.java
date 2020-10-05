package org.egg.integration.dp.proxy;

import org.junit.Test;

/**
 * 代理模式
 */
public class Client {

    @Test
    public void proxyHello() {
        Subject subject = new ProxySubject();
        subject.hello();
    }

}
