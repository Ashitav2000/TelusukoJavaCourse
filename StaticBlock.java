class Mobile2{
    String brand;
    int price;
    static String name;
    //Since name is static it should be initialized only once so it is not given inside constructor
    //Mobile2 is a constructor which has same name as class, doesn't have return type and is automatically called
    // when an object of the class is created
    //static block will be called only once irrespective to how many that were created
    static{
        name = "Phone";
        System.out.println("in static block");
    }
    // every time an object is created the constructor is called
    public Mobile2(){
        brand = " ";
        price = 200;
        System.out.println("in constructor");
    }

    public void show(){
        System.out.println(brand+ " ; " + price + " ; " + name);
    }
}

public class StaticBlock {
    public static void main(String[] args) throws ClassNotFoundException {
//        Mobile2 obj = new Mobile2();
//        obj.brand = "Apple";
//        obj.price = 1500;
//        Mobile2.name = "SmartPhone";
//
//        Mobile2 obj2 = new Mobile2();

        // to load the class and static block without using objects
        Class.forName("Mobile2");
    }

}

