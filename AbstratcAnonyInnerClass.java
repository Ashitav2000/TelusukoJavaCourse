abstract class BB{
    public abstract void show();
}

public class AbstratcAnonyInnerClass {
    public static void main(String[] args){
        BB obj = new BB(){
            public void show(){
                System.out.println("In new show");
            }
        };
        obj.show();
    }
}
