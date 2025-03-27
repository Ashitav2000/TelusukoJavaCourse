import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEachStream {
    public static void main(String[] args)
    {
        List<Integer> nums = Arrays.asList(2,3,4,5,6,7);

        // Consumer is a functional interface
//        Consumer<Integer> con = new Consumer<Integer>() {
//            public void accept(Integer n) {
//                System.out.println(n);
//            }
//        };

        // Consumer<Integer> con = (Integer n) -> System.out.println(n);
//        Consumer<Integer> con = n -> System.out.println(n);
//
//
//        nums.forEach(con);

        nums.forEach(n -> System.out.println(n));


//        nums.forEach(n -> System.out.println(n));


//        int sum = 0;
//        for(int n : nums)
//        {
//            if(n%2 == 0){
//                n = n*2;
//                sum = sum + n;
//            }
//        }
//        System.out.println(sum);
    }
}
