import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

//class Students implements Comparable<Students>
class Students
{
    int age;
    String name;

    public Students(int age, String name)
    {
        this.age=age;
        this.name=name;
    }

    public String toString() {
        return "Students [age=" + age + ", name=" +name +"]";
    }

//	public int CompareTo(Students that)
//	{
//		return 0;
//		if(this.age >that.age)
//			return 1;
//		else
//			return -1;
//	}
}

public class ComparatorComparableCollection {
    public static void main(String[] args) {

//    	Comparator<Integer> com=new Comparator<Integer>()
//    	{
//    		public int compare(Integer i,Integer j)
//    		{
//    			if(i%10 >j%10)
//    				return 1;
//    			else
//    				return -1;
//    		}
//    	};
//    	List<Integer> nums= new ArrayList<>();
//    	nums.add(43);
//    	nums.add(31);
//    	nums.add(72);
//    	nums.add(29);
//    	Collections.sort(nums);
//      Collections.sort(nums, com);
//    	System.out.println(nums);

        Comparator<Students> com = new Comparator<Students>() {
            public int compare(Students i, Students j) {
                if (i.age > j.age)
                    return 1;
                else
                    return -1;
            }
        };

        // Comparator<Students> com=(i,j) -> i.age > j.age?1:-1;
        List<Students> studes = new ArrayList<>();
        studes.add(new Students(21, "Ashita"));
        studes.add(new Students(12, "Teja"));
        studes.add(new Students(18, "Virein"));
        studes.add(new Students(28, "Rahul"));
        Collections.sort(studes,com);
        for (Students s : studes) {
            System.out.println(s);
        }
    }
}

