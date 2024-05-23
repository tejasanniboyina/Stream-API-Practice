package com.collectionsdemo;

@FunctionalInterface
interface A{
    void show();
}

public class LambdaDemo {

    public static void main(String[] args) {
        A obj = () -> System.out.println("Lambda Expression");

        obj.show();
    }
}
