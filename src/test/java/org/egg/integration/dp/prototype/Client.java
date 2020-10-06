package org.egg.integration.dp.prototype;

import org.junit.Test;

public class Client {

    @Test
    public void resume() throws Exception{
        Resume resume = new Resume("aaa", 18);
        resume.setAddress("123456");
        resume.setGoodAt("game");
        Resume resume1 = resume.clone();
        resume1.setGoodAt("move");
        resume.display();
        resume1.display();
    }

}
