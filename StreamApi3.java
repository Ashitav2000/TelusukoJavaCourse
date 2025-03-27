import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamApi3 {
    public static void main(String[] args)
    {
        List<Integer> nums = Arrays.asList(2,3,4,5,6,7);

//        Predicate<Integer> p =(Integer n)-> n%2==0;

//        Predicate<Integer> p =new Predicate<Integer>() {
//            public boolean test(Integer n) {
//                if(n%2==0)
//                    return true;
//                else
//                    return false;
//            }
//        };

//        Function<Integer, Integer> fun = new Function<Integer, Integer>() {
//            public Integer apply(Integer n) {
//                return n*2;
//            }
//        };
//        Function<Integer, Integer> fun = (Integer n)-> n*2;

//        int result = nums.stream()
////                .filter(p)
//                //.filter(p)
//                .filter((Integer n)-> n%2==0)
////                .map(n->n*2)
//                //.map(fun)
//                .map((Integer n)-> n*2)
//                .reduce(0, (c,e) -> c+e);
//        System.out.println(result);

        Stream<Integer> sortedValues = nums.stream()
                        .filter(n->n%2==0)
                        .sorted();
        sortedValues.forEach(n->System.out.println(n));

    }
}
