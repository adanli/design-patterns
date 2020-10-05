package org.egg.integration.dp.decorator;

public class WareDress extends DecoratorWare{

    @Override
    public void show() {
        System.out.println("穿了裙子");
        super.show();
    }
}
