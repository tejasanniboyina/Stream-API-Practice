package com.collectionsdemo;

import java.util.*;
public class VectorDemo {
    public static void main(String[] args){
        Vector a =new Vector();
        a.add("teja");
        a.add(1,22);
        a.addElement("male");
        System.out.println(a);
        a.removeElement(22);
        System.out.println(a);
        a.removeElementAt(1);
        System.out.println(a);
        a.elementAt(0);
        System.out.println(a);
        a.firstElement();
        a.lastElement();
        System.out.println(a);
        System.out.println( a.capacity());
        System.out.println( a.size());




    }
}
