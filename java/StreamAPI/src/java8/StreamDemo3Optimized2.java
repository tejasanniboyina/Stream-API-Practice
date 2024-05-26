package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo3Optimized2 {
    public static void  main(String[] args){
        List<Integer> values = Arrays.asList(3,4,2,1,5,6);
        // REPLACE THE REFERENCE VALUES WHICH ARE USED ONLY ONCE WITH CODE


//        Stream<Integer> s = values.stream();
//
//        Stream<Integer> s1 = s.map(i -> i*2);
//
//        Integer result = (Integer)s1.reduce(0,(c,e) -> c+e);
//
//        System.out.println(result);


        //THE CODE TURNS OUT INTO

//        Integer result = (Integer)values.stream().map(i -> i*2).reduce(0,(c,e) -> c+e);
//        System.out.println(result);

        //EVEN MORE
        System.out.println(values.stream().map(i -> i*2).reduce(0,(c,e) -> c+e));

    }
}
