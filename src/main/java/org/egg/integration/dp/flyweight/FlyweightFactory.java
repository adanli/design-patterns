package org.egg.integration.dp.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    private final static Map<String, Flyweight> map = new HashMap<>();
    private final static Object flyweightFactoryLock = new Object();

    public static Flyweight get(String key) {
        Flyweight flyweight = map.get(key);
        if(flyweight != null) {
            return flyweight;
        }
        synchronized (flyweightFactoryLock) {
            if(map.get(key) == null) {
                flyweight = new ConcreteFlyweight();
                map.put(key, flyweight);
            }
        }
        return flyweight;
    }

}
