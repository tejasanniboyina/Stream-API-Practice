package java8;

import java.util.Arrays;
import java.util.List;


public class FindFirstDemo {
    public static void main(String[] args){
        List<Integer> values = Arrays.asList(12,20,35,45,55,68,75);

        System.out.println(values.stream().filter(i -> i%2==0).map(i -> i*2).findFirst());
        //findFirst just returns the first element in the stream
        //if no element is available it returns empty.
        System.out.println(values.stream().filter(i -> i%2==0).map(i -> i*2).findFirst().orElse(0));
        //instead of printing empty , we can print an element usinf orElse() method by passing an element to it

    }
}
