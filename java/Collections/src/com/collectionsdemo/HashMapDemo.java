package com.collectionsdemo;
import java.util.*;

public class HashMapDemo {
    public static void main(String[] args){
        HashMap a = new HashMap();
        a.put("teja",1);
        a.put("guna",2);
        a.put("anup",3);
        a.put("vaish",4);
        System.out.println(a);
        System.out.println(a.put("teja",0));
        //collection view of a  map
        Set s = a.keySet();
        System.out.println(s);
        Set s2 =a.entrySet();
        System.out.println(s2);
        Iterator i1=s2.iterator();
        while(i1.hasNext()){
            Map.Entry m1 = (Map.Entry)i1.next();
            System.out.println(m1.getKey()+"---------" + m1.getValue());


        }

    }

    //in linkedhashmap insertion order is preserved
}
