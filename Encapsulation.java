class Human{
    // this age variable is accessible in the same class and no one outside this class cannot access it
    private int age; //= 24;
    private String name; //= "Ashita";

    public int getAge(){
        return age;
    }
    public void setAge(int a){
        age = a;
    }
    public String getName() {
        return name;
    }
    public void setName(String n){
        name = n;
    }
}
public class Encapsulation {
    public static void main(String[] args){
        Human hu = new Human();
        hu.setAge(24);
        hu.setName("Ashita");

        System.out.println(hu.getName() + " ; " + hu.getAge());
    }
}
