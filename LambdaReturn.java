import java.lang.FunctionalInterface;

@FunctionalInterface
interface As{
    int add(int i, int j);
}
public class LambdaReturn {
    public static void main(String[] args){
        //return cannot be written
        //As aa =  (int i, int j)-> return i+j;
        As aa =  (int i, int j)-> i+j;
        int result = aa.add(5,6);
        System.out.println(result);

    }
}
