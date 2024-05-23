package com.collectionsdemo;

import java.util.*;

public class Java8Demo {
    public static void main(String[] args) {
        //another way to create ArrayList
        List<Integer> a  = Arrays.asList(1, 2, 3, 4, 5, 6);

        // first way to print elements
//        for(int i=0;i<6;i++){
//            System.out.println(a.get(i));
//        }

        //second way to print elements
//        Iterator itr = a.iterator();
//        while(itr.hasNext()){
//            System.out.println(itr.next());
//        }

        //third way is to use enhanced for loop
//        for(int i : a){
//            System.out.println(i);
//        }
        // all the above loops are called as external iterations


        // print using internal iteration, done by using Stream api
        // every value in "a" is passed to Consumer Interface via forEachj
         a.forEach(i -> System.out.println(i));
         //for interfaces with only one method, no need to create the object , we direct use the method by using ->
    }
}
