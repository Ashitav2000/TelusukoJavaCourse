interface Cmp{
    void code();
}
class Lap implements Cmp{
    public void code(){
        System.out.println("code,compile,run");
    }
}
class Desk implements Cmp{
    public void code(){
        System.out.println("code,compile,run : faster");
    }
}
class Develop{
    public void devcode(Cmp la){
        la.code();
    }
}
public class InterfaceNeed {
    public static void main(String[] args){
        Lap la =new Lap();
        Desk de = new Desk();
        Develop dev = new Develop();
        //dev.devcode(de);
        dev.devcode(la);
    }
}
