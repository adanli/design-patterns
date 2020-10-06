package org.egg.integration.dp.templatemethod;

public class ConcreteExam extends Exam {
    @Override
    public String answer1() {
        return "回答第1个问题的答案";
    }

    @Override
    public String answer2() {
        return "回答第2个问题的答案";
    }
}
