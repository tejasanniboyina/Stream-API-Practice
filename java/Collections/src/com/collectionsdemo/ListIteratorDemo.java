package com.collectionsdemo;

import java.util.*;
public class ListIteratorDemo {
    public static void main(String[] args){
        ArrayList a = new ArrayList();
        a.add("Teja");
        a.add("Guna");
        a.add("Siva");
        a.add("Anup");
        a.add("harsha");
        System.out.println(a);

        ListIterator li = a.listIterator();
        while(li.hasNext()){
            String s= (String)li.next();
            if(s.equals("Teja")){
                li.add("vaish");
            }
            if(s.equals("Siva")){
                li.remove();
            }
        }
        System.out.println(a);
    }
}
