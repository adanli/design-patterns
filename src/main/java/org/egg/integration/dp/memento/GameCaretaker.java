package org.egg.integration.dp.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * 保存Memento
 */
public class GameCaretaker {
    private List<GameMemento> gameMementos = new ArrayList<>();

    public void attach(GameMemento memento) {
        gameMementos.add(memento);
    }

    public GameMemento get(int index) {
        return gameMementos.get(index);
    }

}
