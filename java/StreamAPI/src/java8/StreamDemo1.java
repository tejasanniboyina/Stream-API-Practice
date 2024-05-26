package java8;
import java.util.*;
import java.util.function.Consumer;

public class StreamDemo1 {
    public static void main(String[] args){
        List<Integer> values = Arrays.asList(3,5,7,9,2,8);
        //fetching using Stream API by Intenal Iterations

      //  values.forEach(i -> System.out.println(i));
        //How does it work??
        //This is how
//        Consumer<Integer> c = new Consumer<Integer>()
//        {//anonymous class
//            public void accept(Integer i){
//                System.out.println(i);
//            }
//        };
//        values.forEach(c);

        //how  to make is efficient??

//        Consumer<Integer> c = i -> System.out.println(i);
//
//        values.forEach(c);

         values.forEach( i -> System.out.println(i));

// -> is Lambda Expression



    }
}
