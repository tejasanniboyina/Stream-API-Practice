package com.collectionsdemo;

import java.util.*;
public class LinkedListDemo {
    public static void main(String[] args){
        LinkedList l = new LinkedList();
        l.add("teja");
        l.add(22);
        l.add("male");
        System.out.println(l);
        l.set(0,"guna");
        System.out.println(l);
        l.add(1,"teja");
        System.out.println(l);
        l.removeFirst();
        System.out.println(l);
        System.out.println(l.getFirst());


    }
}
