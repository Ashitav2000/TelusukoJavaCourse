class L{
    public void showTheResults(){
        System.out.println("In L show");
    }
}

class F extends L{
    @Override
    public void showTheResults(){
        System.out.println("In F show");
    }
}
public class Annotations {
    public static void main(String[] args){
        F obj = new F();
        obj.showTheResults();
    }
}
