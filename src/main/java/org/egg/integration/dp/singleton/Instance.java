package org.egg.integration.dp.singleton;

public class Instance {
    private static Instance instance;

    private Instance(){

    }

    public static Instance getInstance() {
        if(instance == null) {
            synchronized (Instance.class) {
                if(instance == null) {
                    instance = new Instance();
                }
            }
        }
        return instance;
    }

}
