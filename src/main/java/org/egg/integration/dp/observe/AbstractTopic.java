package org.egg.integration.dp.observe;

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象的主题，每个主题可以设置自己的观察者
 */
public abstract class AbstractTopic {
    public List<Observer> observers = new ArrayList<>();

    public void attach(Observer o) {
        observers.add(o);
    }

    public void detach(Observer o) {
        for(Observer observer: observers) {
            if(o.equals(observer)) {
                observers.remove(observer);
                break;
            }
        }
    }

    public void change() {
        for(Observer o: observers) {
            o.change();
        }
    }

    public void show() {
        for (Observer o: observers) {
            System.out.println(o);
        }
    }

}
