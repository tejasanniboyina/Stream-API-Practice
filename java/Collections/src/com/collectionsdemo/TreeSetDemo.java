package com.collectionsdemo;

import java.util.*;
public class TreeSetDemo {
    public static void main(String[] args){
        TreeSet a  = new TreeSet();
        a.add("a");
        a.add("V");
        a.add("F");
        System.out.println(a);
        a.add(null);
        //null possible only when the tree is empty
        //heterogenous is not possible

    }
}
