public class Ternary {
    public static void main(String[] args)
    {
        int n = 5;
        int result = 0;
        //if(n%2==0)
            //result = 10;
        //else
            //result = 20;
        //if it is true ? then if it is false :. ?:
        result = n%2==0 ? 10 : 20;
        System.out.println(result);
    }
}
