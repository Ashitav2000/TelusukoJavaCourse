class Calc{
    public int add(int n1, int n2, int n3){
        return n1+n2+n3;
    }
    public int add(int n1, int n2){
        return n1+n2;
    }
    public double add(double n1, int n2){
        return n1+n2;
    }
}

public class Methods {
    public static void main(String[] args){
        Calc ca = new Calc();
        //in is a reference variable
        Integer in = ca.add(3,4);
        Double dob= ca.add(4.5,6);
        System.out.println(in);
        System.out.println(dob);
    }
}
