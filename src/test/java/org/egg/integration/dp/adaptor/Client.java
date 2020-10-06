package org.egg.integration.dp.adaptor;

import org.egg.integration.dp.adaptor.target.TargetService;
import org.junit.Test;

/**
 * 适配器模式
 */
public class Client {
    @Test
    public void adapter() {
        TargetService target = new Adaptor();
        target.hello("aaa");
    }
}
