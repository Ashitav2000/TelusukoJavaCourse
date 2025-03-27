enum Status{
    Running, Failed, Pending, Success;
}
public class Enums {
    public static void main(String[] args){
        //Status s = Status.Success;
        //System.out.println(s.ordinal()); //gives the location of Success
        // to print all status
        //.values() gives an array so we need to define it an array format
        Status[] s = Status.values();
        // to print all use for
        for (Status i : s){
            System.out.println(i + " : " + i.ordinal());
        }
        System.out.println(s[0]);
    }
}

