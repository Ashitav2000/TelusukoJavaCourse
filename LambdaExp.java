import java.lang.FunctionalInterface;

@FunctionalInterface
interface Ak{
    void show(int i);
}
//class Ag implements Ah{
//    public void show(){
//        System.out.println("In show");
//    }
//
//}

public class LambdaExp {
    public static void main(String[] args){
        //Ah aa= new Ag();
        //called syntactical sugar
//        Ak aa = new Ak() {
//            public void show(int i) {
//                System.out.println("In show" + i);
//            }
//        }; or
        // Ak aa = (int i) -> System.out.println("In show" + i);
        Ak aa =  i -> System.out.println("In show" + i);
        //Ak aa = () -> System.out.println("In show");
        aa.show(5);
    }
}
