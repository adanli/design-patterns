package org.egg.integration.dp.templatemethod;

public abstract class Exam {
    /**
     * 模版方法
     */
    public void exam() {
        System.out.println("题目1: xxxxxx");
        System.out.println("答案1:" + answer1());
        System.out.println("题目2: xxxxxx");
        System.out.println("答案2:" + answer2());
    }

    public abstract String answer1();
    public abstract String answer2();

}
