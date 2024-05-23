package com.collectionsdemo;
import  java.util.*;
public class MyComparator implements Comparator {
    public int compare(Object a, Object b){
        Integer i1=(Integer)a;
        Integer i2=(Integer)b;

        if(i1<i2){
            return +100;
        }else if(i1>i2){
            return -100;
        }else{
            return 0;
        }
    }
}
