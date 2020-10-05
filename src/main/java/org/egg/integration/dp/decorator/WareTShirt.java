package org.egg.integration.dp.decorator;

public class WareTShirt extends DecoratorWare{

    @Override
    public void show() {
        System.out.println("穿了T恤");
        super.show();
    }
}
