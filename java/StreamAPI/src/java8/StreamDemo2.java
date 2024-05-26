package java8;
import java.util.*;
public class StreamDemo2 {
    public static void main(String[] args){
        List<Integer> values = Arrays.asList(1,4,3,6,7,8);

        values.forEach(System.out::println);//method referencing 
    }

}
