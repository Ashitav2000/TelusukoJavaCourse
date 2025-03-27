import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamApi2 {
    public static void main(String[] args)
    {
        List<Integer> nums = Arrays.asList(2,3,4,5,6,7);

        // whatever is done in stream it will not effect the original list
        //stream will run only once i.e it will not repeat same action
        Stream<Integer> s1 = nums.stream();
        //filter will give new stream
        Stream<Integer> s2 = s1.filter(n->n%2==0);
        Stream<Integer> s3 = s2.map(n->n*2);
        //reduce will give only single value
        //int result = s3.reduce(0, (c,e) -> c+e);

        int result = nums.stream() // gives a stream
                        .filter(n->n%2==0) // on the stream filter is applied which gives a new stream
                        .map(n->n*2) // on the new stream map is applied which then gives new stream
                        .reduce(0, (c,e) -> c+e); // reduce is applied on the new stream

        System.out.println(result);
        //s1.forEach(n -> System.out.println(n));
        //s2.forEach(n -> System.out.println(n));
//        s3.forEach(n -> System.out.println(n));

    }
}
