package org.egg.integration.dp.proxy;

public class ProxySubject extends Subject{
    private Subject subject;

    @Override
    public void hello() {
        if(subject == null) {
            subject = new ActualSubject();
        }
        subject.hello();
    }
}
