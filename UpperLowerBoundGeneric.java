import java.util.ArrayList;
import java.util.List;

class Humans2{
    public void sleep() {
        System.out.println("Humans sleep well");
    }
}
class Animal2 extends Humans2{
    public void sleep() {
        System.out.println("Animals sleep well");
    }
}

public class UpperLowerBoundGeneric {
    public static void main(String[] args) {
        //parent type reference variable can refer to child type reference variable
        Humans2 hu = new Humans2();
        Humans2 hu2 = new Humans2();
        Animal2 an = new Animal2();
        Animal2 an2 = new Animal2();
        //hu = an;

        //UPPER BOUND
        //this collection can refer to any of object which are working for Humans2 object or child of Humans2
//        ArrayList<? extends Humans2> humanList = new ArrayList<>();
//        ArrayList<Animal2> animalList = new ArrayList<>();
//        ArrayList<String> stringList = new ArrayList<>();
//        ArrayList<Object> objectList = new ArrayList<>();
//        ArrayList<Humans2> humanList2 = new ArrayList<>();
//
//        humanList = animalList;
//        humanList = humanList2;
        //there is no connection between Humans and strings
        //humanList = stringList;
//        humanList = objectList;

        //LOWER BOUND
        //this works for anything that is parent of humans2 or humans2 object
        ArrayList<? super Humans2> humanList = new ArrayList<>();
        ArrayList<Animal2> animalList = new ArrayList<>();
        animalList.add(an);
        animalList.add(an2);
        ArrayList<String> stringList = new ArrayList<>();
        ArrayList<Object> objectList = new ArrayList<>();
        ArrayList<Humans2> humanList2 = new ArrayList<>();
        humanList2.add(hu);
        humanList2.add(hu2);
        invokeSleep(humanList2);
//        humanList = animalList;
  //        humanList = objectList;
    }
    public static void invokeSleep(List<? extends Humans2> list){
        for(Humans2 hu:list){
            hu.sleep();
        }
    }
}
