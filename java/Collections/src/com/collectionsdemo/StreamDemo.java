package com.collectionsdemo;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
public class StreamDemo {
    public static void main(String[] args){
        List<Integer> nums = Arrays.asList(9,3,6,4,1,7);

        //builder pattern
//         nums.stream()
//                 .filter(n -> n%2==1)
//                 .sorted()
//                 .map(n -> 2*n)
//                 .reduce(0);

        // Stream<Integer> twice =  data.map(n -> n*2);
        //we can use only once
        //twice.forEach(p -> System.out.println(p));
    }
}

