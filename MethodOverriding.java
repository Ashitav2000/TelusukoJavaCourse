class ABC{
//    public void show(){
//        System.out.println("In ABC Show");
//    }
//    public void config(){
//        System.out.println("In ABC Config");
//    }
    public int add( int a, int b){
        return a+b;
    }
}
class XYZ extends ABC{
//    public void show(){
//        System.out.println("In ABC Show");
//    }
    public int add(int a, int b){
        return a+b+1;
    }
}
public class MethodOverriding {
    public static void main(String[] args){
        XYZ obj = new XYZ();
        int r1 = obj.add(4,5);
        System.out.println(r1);
    }
}
