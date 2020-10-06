package org.egg.integration.dp.prototype;

public class Resume implements Cloneable {
    private String name;
    private int age;
    private String address;

    /**
     * 特长
     * @param name
     * @param age
     */
    private String goodAt;

    public Resume(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setGoodAt(String goodAt) {
        this.goodAt = goodAt;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    protected Resume clone() throws CloneNotSupportedException {
//        return this;
        Resume resume = (Resume) super.clone();
        resume.setGoodAt(goodAt);
        return resume;
    }

    public void display() {
        System.out.println(String.format("姓名: %s, 年龄: %d, 地址: %s, 特长: %s", name, age, address, goodAt));
    }

}
