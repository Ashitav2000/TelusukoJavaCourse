import java.util.ArrayList;

class Humans{
    public void sleep() {
        System.out.println("Humans sleep well");
    }
}
class Animal extends Humans{
    public void sleep() {
        System.out.println("Animals sleep well");
    }
}
public class WildcardGenerics {
    public static void main(String[] args){
        //parent type reference variable can refer to child type reference variable
        Humans hu = new Humans();
        Animal an = new Animal();
        hu = an;

        //for collections, it is not possible to refer
//        ArrayList<Humans> humanList = new ArrayList<>();
//        ArrayList<Animal> animalList = new ArrayList<>();
//        humanList  = animalList;

        //For collections, we can write in the below way
//        ArrayList<Humans> humanList = new ArrayList<>();
//        ArrayList<Humans> humanList2 = new ArrayList<>();
//        humanList  = humanList2;

        // ? is wildcard used to refer any unknown objects
        ArrayList<?> humanList = new ArrayList<>();
        ArrayList<Animal> animalList = new ArrayList<>();
        humanList  = animalList;
        }

}
