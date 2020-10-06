package org.egg.integration.dp.templatemethod;

import org.junit.Test;

public class Client {
    @Test
    public void exam() {
        Exam exam = new ConcreteExam();
        exam.exam();
    }

}
