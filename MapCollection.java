import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class MapCollection {
    public static void main(String[] args){
        Map<String, Integer> student = new HashMap<>();
        // hashtable is synchronized.
        // Map<String, Integer> students = new Hashtable<>();
        student.put("Ashita",55);
        student.put("Ravi",34);
        student.put("Harsh",23);
        student.put("Virein",92);
        student.put("Prema",67);
        //System.out.println(student.get("Ravi"));
        //System.out.println(student);
        System.out.println(student.keySet());
//        for (String key : student.keySet()){
//            System.out.println(key + " : " + student.get(key));
//        }

    }
}
