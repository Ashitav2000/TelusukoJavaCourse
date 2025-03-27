@java.lang.FunctionalInterface
interface Ah{
    void show();
}
//class Ag implements Ah{
//    public void show(){
//        System.out.println("In show");
//    }
//
//}

public class FunctionalInterface {
    public static void main(String[] args){
        //Ah aa= new Ag();
        Ah aa = new Ah(){
            public void show() {
                System.out.println("In show");
            }
        };
        aa.show();
    }
}
