import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionSet1 {
    public static void main(String[] args){
        Set<Integer> nums=new HashSet<Integer>();
        nums.add(23);
        nums.add(6);
        nums.add(82);
        nums.add(37);

        for(int n:nums)
        {
            System.out.println(n);
        }

    }
}
