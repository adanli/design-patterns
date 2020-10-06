package org.egg.integration.dp.state;

import org.junit.Test;

/**
 * 状态模式
 */
public class Client {
    /**
     * 根据每天时间的不同决定做的事情
     */
    @Test
    public void todo() {
        TodoContext context = new TodoContext(new MorningState(), 13);
        context.work();
    }
}
