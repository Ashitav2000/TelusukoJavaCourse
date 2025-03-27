public class IfElse {
    public static void main(String[] args){
        int x = 9;
        int y = 7;
        int z = 10;
        //int x = 8;
        //if(true) gives output
        //if(false) doesn't give output
        //if(x>10 && x<=20)
            //System.out.println("Hello");
        //else
            //System.out.println("Bye");
        //System.out.println("Bye");
        if(x>y && x>z)
            System.out.println(x);
        else if(y>z) {
            System.out.println(y);
        }
        else
            System.out.println(z);
    }
}
