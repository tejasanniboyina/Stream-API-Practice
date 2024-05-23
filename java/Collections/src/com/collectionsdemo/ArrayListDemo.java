package com.collectionsdemo;

import java.util.*;
public class ArrayListDemo {
    public static void main(String[] args){
        ArrayList  a = new ArrayList();
        a.add(1);
        a.add('t');
        a.add('a');
        System.out.println(a);
        a.remove(2);
        System.out.println(a);
        a.add(2,"apple");
        System.out.println(a);


    }

}
