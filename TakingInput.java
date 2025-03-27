import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter a number");
//        InputStreamReader in = new InputStreamReader(System.in);
//        BufferedReader bf = new BufferedReader(in);
        Scanner sc = new Scanner(System.in);
        //int a = Integer.parseInt(bf.readLine());
        int a = sc.nextInt();
        System.out.println(a);
    }
}
