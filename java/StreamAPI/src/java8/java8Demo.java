package java8;

import java.util.*;
public class java8Demo {
    public static void main(String[] args){
        //creating an ArrayList
        List<Integer> l = Arrays.asList(3,5,7,9,8,2);

        //to fetch the values from ArrayList
        //one method is to use for loop
        for(int i =0 ;i<6;i++){
            //get by index
            System.out.println(l.get(i));
        }

        //second method is to use Iterator
        Iterator<Integer> itr = l.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        //third way is to use enhanced for loop
        for(int i : l){
            System.out.println(i);
        }
        //all these methods are called as external iterations
    }


    //METHODS CAN BE DEFINED IN INTERFACES FROM VERSION 1.8 USING THE KEYWORD Default.
    //An Interface that contains only one method is called as Functional Interface.

}
