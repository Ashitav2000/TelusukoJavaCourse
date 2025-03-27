interface H{
    void show();
    void config();
}
interface I{
    void run();
}
interface K extends I{

}
class J implements H,I{
    public void show(){
        System.out.println("in show");
    }
    public void config(){
        System.out.println("in config");
    }
    public void run(){
        System.out.println("in run");
    }
}


public class InterfaceExample {
    public static void main(String[] args){
        H obj;
        obj = new J();
        obj.show();
        obj.config();
    }
}
