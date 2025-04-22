import java.io.*;

public class FileInputOutput1 {
    public static void main(String[] args){
        try {
//            File file1 = new File("/Users/ashitavemulapalli/Documents/Intelli/New/src/java2.txt");
//            System.out.println(file1.exists());
//            System.out.println(file1.createNewFile());

            File dir = new File("/Users/ashitavemulapalli/Documents/Intelli/New/src/Dir");
            System.out.println(dir.exists());

            dir.mkdir();
            System.out.println(dir.exists());
        }
        catch (Exception e) {
            System.out.println("Some problem");;
        }

    }
}
