class Mobile{
    // printing variables outside the method is instance variable
    String brand;
    int price;
    // making name common to all the objects by using static
    static String name;
    // printing a variable inside the method is local variable
    public void show(){
        System.out.println(brand+ " ; " + price + " ; " + name);
    }

}
public class StaticVariable {
    public static void main(String[] args){
        //obj reference variable
        Mobile obj = new Mobile();
        obj.brand = "Apple";
        obj.price = 1500;
        //static variable should be called with class names not the object names
        Mobile.name = "SmartPhone";

        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 1900;
        Mobile.name = "SmartPhone";
        // after giving static keyword to the variable
        obj.name = "Phone";

        obj.show();
        obj2.show();
    }
}
