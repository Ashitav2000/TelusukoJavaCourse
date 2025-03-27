class Human3{
    private int age;
    private String name;

    public Human3() {
        age = 24;
        name = "Ashita";

    }

    public Human3(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class Constructors {
    public static void main(String[] args){
        Human3 hu = new Human3();
        //Human3 hu2 = new Human3(25, "Vemulapalli");
        System.out.println(hu.getName() + " ; " + hu.getAge());
        //System.out.println(hu2.getName() + " ; " + hu2.getAge());
//        hu.setAge(24);
//        hu.setName("Ashita");

        //System.out.println(hu.getName() + " ; " + hu.getAge());

    }
}
