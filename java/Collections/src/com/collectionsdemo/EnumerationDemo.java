package com.collectionsdemo;

import java.util.*;
public class EnumerationDemo {
    public static void main(String[] args){
        Vector a = new Vector();
        for(int i=0;i<10;i++){
            a.addElement(i);
        }
        System.out.println(a);
        Enumeration e = a.elements();
        while(e.hasMoreElements()){
        Integer i = (Integer)e.nextElement();
        if(i%2 == 0){
            System.out.println(i);
        }
        }
        System.out.println(a);
    }
}
