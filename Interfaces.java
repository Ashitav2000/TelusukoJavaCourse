interface Aa{
    int age = 24;
    String area = "Hamden";
    void show();
    void config();
}
class Bb implements Aa{
    public void show() {
        System.out.println("In show");
    }
    public void config() {
        System.out.println("In config");
    }
}

public class Interfaces {
    public static void main(String[] args){
        Aa obj;
        obj = new Bb();
        obj.show();
        obj.config();
        System.out.println(Aa.area);
    }
}
