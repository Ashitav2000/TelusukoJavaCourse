import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryWithResources {
    public static void main(String[] args) throws IOException {
//        int i = 0;
//        int j = 0;
        int num = 0;
        BufferedReader bf = null;
        try {
            //InputStreamReader in = new InputStreamReader(System.in);
            //BufferedReader bf = new BufferedReader(in);
            bf = new BufferedReader(new InputStreamReader(System.in));
            num = Integer.parseInt(bf.readLine());
            System.out.println(num);
//            j = 18/i;
        }
        //when finally used we can skip catch block but throws an exception
//        catch (Exception e) {
//            System.out.println("Something went wrong ");
//        }
        //whenever we want to close resource we finally
        //whether we get the exception or not the finally block will allow statement to print
        finally {
            bf.close();
        }
    }
}
