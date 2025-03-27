import java.util.ArrayList;

public class GenericsExample {
    public static void main(String[] args){
        String[] names = new String[5];
//        names[0] = "Rohan";
//        names[1] = "Rohit";
//        names[2] = "Ramesh";
//
//        String name1 = names[0];
//        String name2 = names[1];

        //<String> tells the list has only string type of data and is generic
        //ArrayList list = new ArrayList();
        ArrayList<String> list = new ArrayList<>();

        list.add("Rohan");
        list.add("Rohit");
        list.add("Ramesh");

        String name1 = list.get(0);
        String name2 = list.get(1);
        String name3 = list.get(2);

//        String name1 = (String)list.get(0);
//        System.out.println(name1.toUpperCase());
    }
}
