package org.egg.integration.dp.adaptor;

import org.egg.integration.dp.adaptor.actual.ActualService;
import org.egg.integration.dp.adaptor.target.TargetService;

public class Adaptor extends TargetService {
    private final ActualService actualService = new ActualService();

    @Override
    public void hello(String name) {
        actualService.otherHello(name);
    }
}
