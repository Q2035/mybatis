package com.blog4java.hsqldb;

/**
 * @Author Q
 * @Date 15/09/2020 12:45
 * @Description
 */
public class TestExtend {
    public static void main(String[] args) {
        Son son = new Son();
        Father father = new Father();
        father.sayIt();
        son.sayIt();
    }
}

class Father {
    protected String say(){
        return "father";
    }

    public void sayIt(){
        System.out.println(say());
    }
}

class Son extends Father{
    @Override
    protected String say() {
        return "son";
    }
}
