package com.collectionsdemo;

import java.util.*;
public class HashsetDemo {
    public static void main(String[] args){
        HashSet a = new  HashSet();
        for(int i = 1;i<=10;i++){
            System.out.println( a.add(i));
        }
        System.out.println(a);
        a.add(null);
        a.add(4);
        a.add(null);
        System.out.println(a);
        System.out.println(  a.add(4));
    }
}

// in LinkedHashSet insertion order is preserved and in HashSet it is not. That is the only difference
