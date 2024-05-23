package com.collectionsdemo;

import java.util.*;
public class IteratorDemo {
    public static void main(String[] args){
        ArrayList a= new ArrayList();
        for(int i=1; i<=10;i++){
            a.add(i);
        }
        System.out.println(a);
        Iterator i = a.iterator();
        while(i.hasNext()){
            Integer t = (Integer)i.next();
            if(t%2==0){
                System.out.println(t);
            }else{
                i.remove();
            }

        }
        System.out.println(a);

    }

}
