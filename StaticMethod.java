class Mobile3{
    String brand;
    int price;
    static String name;
    public void show(){
        System.out.println(brand+ " ; " + price + " ; " + name);
    }
    public static void show2(Mobile3 obj){
        //System.out.println("in static method");
        System.out.println(obj.brand+ " ; " + obj.price + " ; " + name);
    }

}

public class StaticMethod {
    public static void main(String[] args){
        Mobile3 obj = new Mobile3();
        obj.brand = "Apple";
        obj.price = 1500;
        //static variable should be called with class names not the object names
        Mobile3.name = "SmartPhone";

        Mobile3 obj2 = new Mobile3();
        obj2.brand = "Samsung";
        obj2.price = 1900;
        Mobile3.name = "SmartPhone";
        // after giving static keyword to the variable
        obj.name = "Phone";

        obj.show();
        obj2.show();
        //calling a static method
        //Mobile3.show2();
        //to call a static method indirectly with non-static variable
        Mobile3.show2(obj);
    }
}
