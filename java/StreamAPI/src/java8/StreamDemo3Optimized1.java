package java8;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo3Optimized1 {

    public static void main(String[] args){
        //List<Integer> values = Arrays.asList(3,4,2,1,5,6);

//        int result = 0;
//        for(int i : values){
//            result = result + i;
//        }
//        System.out.println(result);

//        System.out.println(values.stream().map(i -> i*2).reduce(0,(c,e) -> c+e ));
//
//        //How does it work???
//        Function<Integer,Integer> f =new Function<Integer,Integer>()//Function is a FUnctional Interface and takes Two generics<T,R> R is return type
//        {//anonymous class
//            public Integer apply(Integer i){
//                return i*2;
//            }
//        };
//
//        BinaryOperator<Integer> b = new BinaryOperator<Integer>()
//        {//Anonymoues class
//            public Integer apply(Integer i, Integer j) {
//
//                return i+j;
//            }
//        };
//        Stream s = values.stream();
//
//        Stream s1 = s.map(f);
//        //map takes the Object of  Function
//
//        Integer result= (Integer)s1.reduce(0,b);//reduce method takes the Object of BinaryOperator Interface.
//        // reduce() returns the Object which we convert it to Integer
//
//        System.out.println(result);



        // O P T I M I Z E D   C O D E

        List<Integer> values = Arrays.asList(3,4,2,1,5,6);
        Stream<Integer> s = values.stream();

//        new Function<Integer,Integer>()
//        {//anonymous class
//            public Integer apply(Integer
        // The above snippet of code can be replaced with Lambda Expression since it is a Function Interface
        // also return can be removed

        Stream<Integer> s1 = s.map(i -> i*2);
        //map takes the Object of  Function

//        Integer result= (Integer)s1.reduce(0, new BinaryOperator<Integer>()
//        {
//            public Integer apply(Integer i, Integer j) {
//
//                return i+j;
//            }
//        }
//        );  THIS CODE CAN BE WRITTEN AS FOLLOWS
        Integer result = (Integer)s1.reduce(0,(c,e) -> c+e);//c is carry and e is value

        System.out.println(result);
    }
}
