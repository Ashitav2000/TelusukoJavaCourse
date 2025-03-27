abstract class Car{
    abstract public void drive();
    abstract public void fly();

    public void playMusic(){
        System.out.println("Play music");
    }
}

abstract class Benz extends Car{
    public void drive(){
        System.out.println("Drive..");
    }
//    public void fly(){
//        System.out.println("Flying");
//    }
}

class BMW extends Benz{ //to create an object need to have a class to implement all the methods called concrete class
    public void fly() {
        System.out.println("Flying");
    }
}
// objects cannot be created for abstract class
public class InterfaceAbstractKeyword {
    public static void main(String[] args){
        Car obj = new BMW();
        obj.drive();
        obj.playMusic();
        obj.fly();
    }
}
