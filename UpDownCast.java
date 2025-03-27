class D{
    public void show1(){
        System.out.println("In D Show1");
    }
}
class E extends D{
    public void show2(){
        System.out.println("In E show2");
    }
}
public class UpDownCast {
    public static void main(String[] args){
//        double d = 5.5;
//        int i = (int)d;
//        System.out.println(i);
          D obj = new E();
//        D obj = new D();

        //Type caste will be of parent class
        //Upcasting
//        D obj = (D) new E();
        obj.show1();

        //downcasting
//        E obj1 = (E) obj;
//        obj1.show2();
    }
}
