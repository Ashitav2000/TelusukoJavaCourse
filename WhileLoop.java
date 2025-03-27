public class WhileLoop {
    public static void main(String[] args){
        int x = 1;
        //while(true){
           // System.out.println("Hi");
        //while(true){
            //System.out.println("Hi" + x);
            //x--;

        //}
        //while(y>0){
            //System.out.println(y);
            //y--;
        //}
        while(x<=4){
            System.out.println("Hi" + x);
            int y=1;
            while(y<=3){
                System.out.println("Hello" + y);
                y++;
            }
            x++;
        }
        System.out.println("Bye" + x);

    }
}
