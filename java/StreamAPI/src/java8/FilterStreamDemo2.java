package java8;
import java.util.List;
import java.util.Arrays;
import java.util.function.Predicate;

public class FilterStreamDemo2 {

    public static void main(String[] args){
        List<Integer> values = Arrays.asList(12,20,35,46,55,68,75);

        //regular method to add the elements % 5 is
//        int result = 0;
//        for (int i : values) if(i%5==0) result +=i;
//        System.out.println(result);

        //by  using stream
        System.out.println(values.stream()
                .filter(i -> i%5==0)
                .reduce(0,(c,e) -> c+e));
        //filter() method forwards the values which satisfy the mention condition, i., filtering out the not required values.


        //HOW DOES THE ABOVE CODE WORKS


         // first filter() takes the Object of Predicate
        // Predicate is the Functional Interface, takes only one argument and returns the Boolean value

        Predicate <Integer> p =new Predicate<Integer>()
        {   //Anonymous class
            //Predicate has one method called test() , takes one argumemnt and returns a Boolean value
            public boolean test(Integer i){
                return i%5 == 0;
            }

        };

        System.out.println(values.stream()
                                        .filter(p)
                                        .reduce(0, (c,e)->c+e));

    }
}


