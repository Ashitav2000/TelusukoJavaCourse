class Ac{
    public void show(){
        System.out.println("In show");
    }
}
public class AnonymousInnerClass {
    public static void main(String[] args){
        Ac obj = new Ac(){
            public void show(){
                System.out.println("In new show");
            }
        };
        obj.show();
    }
}
