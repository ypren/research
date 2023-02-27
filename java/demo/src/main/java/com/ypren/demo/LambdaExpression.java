package com.ypren.demo;

import javax.xml.transform.stream.StreamSource;

/**
 * Lambda expression test.
 * Added in Java 8.
 */
public class LambdaExpression {
    Runnable r1 = () -> System.out.println(this);
    Runnable r2 = () -> System.out.println(hello());

    public static void main(String[] args) {
        LambdaExpression l1 = new LambdaExpression();
        LambdaExpression l2 = new LambdaExpression();
        l1.r1.run();
        l2.r2.run();
    }

    public String hello() {
        return "Hello";
    }

//    public String world() {
//        return "world";

    @Override
    public String toString() {
        return "LambdaExpression{" +
                "r1=" + r1 +
                ", r2=" + r2 +
                '}';
    }
//    }
}
