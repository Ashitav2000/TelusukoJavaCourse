import java.util.Collection;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.Set;

public class CollectionTreeSet {
    public static void main(String[] args){

        //Treeset gives ordering
     	//Set<Integer> nums=new TreeSet<Integer>();
        //Instead of Set we can give collection cause the treeset implements set which extend collection
        Collection<Integer> nums=new TreeSet<Integer>();
        nums.add(62);
        nums.add(54);
        nums.add(82);
        nums.add(21);

        for(int n:nums)
        {
            System.out.println(n);
        }

        //On top of Collection we have Iterable

        Iterator<Integer> values = nums.iterator();
        //hasNext() tells if there is next element or not
        while(values.hasNext())
            System.out.println(values.next());

    }
}
