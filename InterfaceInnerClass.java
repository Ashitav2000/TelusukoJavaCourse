class Ab{
    public void show(){
        System.out.println("In show");
    }
    static class Bc{
        public void config(){
            System.out.println("In config");
        }
    }
}

public class InterfaceInnerClass {
    public static void main(String[] args){
        Ab obj = new Ab();
        obj.show();

        //If class Bc is not static; Ab.Bc obj2 = obj.new Bc();
        Ab.Bc obj2 = new Ab.Bc();
        obj2.config();
    }
}
