class P{
    public void show(){
        System.out.println("In P Show");
    }
}
class Q extends P{
    public void show(){
        System.out.println("In Q Show");
    }
}
class R extends Q{
    public void show(){
        System.out.println("In R Show");
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args){
       P obj = new Q(); //this will give Q show as output as the object is created for the child class
//        P obj = new P();
//        obj.show();
//
//        // Assign an object to the old variable
//        obj = new Q();
//        obj.show();
//
//        obj = new R();
        obj.show();
    }
}
