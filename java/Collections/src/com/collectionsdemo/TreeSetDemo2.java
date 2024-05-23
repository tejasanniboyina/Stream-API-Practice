package com.collectionsdemo;

import java.util.*;
public class TreeSetDemo2 {
    public static void main(String[] args){
        TreeSet a = new TreeSet(new MyComparator());
        a.add(20);
        a.add(0);
        a.add(15);
        a.add(10);
        System.out.println(a);


    }
}
