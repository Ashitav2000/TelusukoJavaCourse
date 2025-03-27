class Computer2{
    // Need to define the access and if we don't want to return use 'void' before method
    public void playMusic(){
        System.out.println("Music Playing");
    }
    // If we want to return something, that datatype of something should be mentioned before method name
    public String getMePen(int cost){
        if(cost >= 10)
            return "Pen";
        return "Nothing";
    }
}

public class ClassBehavior2 {
    public static void main(String[] args){
        Computer2 comp = new Computer2();
        comp.playMusic();
        // just calling comp.getMePen(), but you aren't assigning the returned value to a variable or printing it.
        String str = comp.getMePen(10);
        System.out.println(str);
    }
}
