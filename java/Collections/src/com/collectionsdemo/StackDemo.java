package com.collectionsdemo;

import java.util.*;
public class StackDemo {
    public static void main(String[] args){
        Stack a =  new Stack();
        a.add("teja");
        a.add(1,22);
        a.addElement("male");
        System.out.println(a);
        System.out.println(a.pop());
        a.push("male");
        System.out.println(a.search("male"));


    }
}
