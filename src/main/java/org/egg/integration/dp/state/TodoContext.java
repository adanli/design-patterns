package org.egg.integration.dp.state;

public class TodoContext extends AbstractContext{
    public TodoContext(AbstractState state, int time) {
        /**
         * 状态
         */
        this.state = state;
        /**
         * 时间
         */
        this.time = time;
    }

    public void setState(AbstractState state) {
        this.state = state;
    }

    public void work() {
        if(state != null) {
            state.handle(this);
        }
    }

}
