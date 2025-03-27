import java.util.ArrayList;
import java.util.List;

public class ArrayListCollection {
    public static void main(String[] args){
        // Collection nums=new ArrayList();
        //below is to convert the object to integer
        // Collection<Integer> nums= new ArrayList<Integer>();
        List<Integer> nums=new ArrayList<Integer>();
        // here the values are not numbers, they are object type
        nums.add(6);
        nums.add(5);
        nums.add(8);
        nums.add(2);

        for(int n:nums)
        {
            System.out.println(nums);
        }

        //list supports index value
        System.out.println(nums.get(2));

        System.out.println(nums.indexOf(2));

//        nums.add("5");
//        for(Object n:nums)
//        {
//            int num = (Integer)n;
//            System.out.println(nums);
//        }
    }
}
