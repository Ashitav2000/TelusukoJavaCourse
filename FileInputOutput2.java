import java.io.File;

public class FileInputOutput2 {
    public static void main(String[] args){
        String filePath = "/Users/ashitavemulapalli/Documents/Intelli/New/src/java1.txt";
        String dirPath = "/Users/ashitavemulapalli/Documents/Intelli/New/src/Dir";
        try {
            File file1 = new File(filePath);
            System.out.println(file1.exists());
//            System.out.println(file1.createNewFile());
//            System.out.println(file1.getPath());
//            System.out.println(file1.isDirectory()); //false
//            System.out.println(file1.isFile()); //true

            File dir = new File(dirPath);
//            System.out.println(dir.exists());
//
//            dir.mkdir();
//            System.out.println(dir.exists());
//            System.out.println(dir.isDirectory()); //true
            System.out.println(dir.isFile()); //false

            File file2 = new File("/Users/ashitavemulapalli/Documents/Intelli/New/src");
            String str[] = file2.list();
            int count = 0;
//            for (String name:str){
//                System.out.println(name);
//            }
            for (String name:str){
                count++;
                System.out.println(name);
            }
            System.out.println("Number of files on the path specified :"+count);
        }
        catch (Exception e) {
            System.out.println("Some problem");;
        }

    }
}
