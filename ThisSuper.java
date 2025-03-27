class X{
    public X(){
        super();
        System.out.println("In X");
    }
    public X(int n){
        super();
        System.out.println("In X int");
    }
}
class Y extends X{
    public Y(){
        super();
        System.out.println("In Y");
    }
    public Y(int n){
        // by passing a parameter here this parameter is goes to the parent class where the constructor has a parameter
        this();
        System.out.println("In B int");
    }
}

public class ThisSuper {
    public static void main(String[] args){
        Y obj = new Y(5);

    }
}
