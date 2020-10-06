package org.egg.integration.dp.memento;

import org.junit.Test;

/**
 * 备忘录模式
 */
public class Client {
    /**
     * 先消耗状态，再恢复状态以及当时的数值
     */
    @Test
    public void resetState() {
        GameOriginator originator = new GameOriginator();
        originator.setState("young");
        originator.setAge(18);
        originator.show();

        GameCaretaker caretaker = new GameCaretaker();
        caretaker.attach(originator.saveMemento());
        originator.setState("old");
        originator.setAge(63);
        originator.show();
        caretaker.attach(originator.saveMemento());

        originator.setState("mid");
        originator.setAge(48);
        originator.show();

        originator.setMemento(caretaker.get(0));
        originator.show();

    }
}
