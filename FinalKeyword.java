// final keyword can be used with variable, method and class

//final class Cal{
class Cal{
    //final method
    //public final void show()
    public void show(){
        System.out.println("In Cal show");
    }
    public void add(int a, int b){
        System.out.println(a+b);
    }
}
// The below cannot be run if the parent class is final
class AdvCal extends Cal{
    public void show(){
        System.out.println("In Cal show");
    }
}

public class FinalKeyword {
    public static void main(String[] args){
        //final variable
//        final int n = 8;
//        n = 10;
//        System.out.println(n);
        Cal ca = new Cal();
        ca.show();
        ca.add(4,6);

    }
}
