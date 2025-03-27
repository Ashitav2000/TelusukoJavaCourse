class Computer{
    // Need to define the access and if we don't want to return use 'void' before method
    public void playMusic(){
        System.out.println("Music Playing");
    }
    // If we want to return something, that datatype of something should be mentioned before method name
    public String getMePen(){
        return "Pen";
    }
}

public class ClassBehavior {
    public static void main(String[] args){
        Computer comp = new Computer();
        comp.playMusic();
        // just calling comp.getMePen(), but you aren't assigning the returned value to a variable or printing it.
        String str = comp.getMePen();
        System.out.println(str);
    }
}
