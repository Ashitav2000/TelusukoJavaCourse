public class TryCatchException {
    public static void main(String[] args){
        //int i = 0;
        int i = 2;
        int j = 0;
        int[] num = new int[5];
        String str = null;

        try{
            j = 18/i;
            System.out.println(str.length());
            System.out.println(num[1]);
            System.out.println(num[5]);
        }
        // handles arithmetic issues
        catch (ArithmeticException e) {
            System.out.println("Cannot divide be zero");;
        }
        catch (ArrayIndexOutOfBoundsException a){
            System.out.println("Stay in the limit");
        }
        //This handles every exception. Exception is the top class which is a parent of parent and should be at the bottom
        catch (Exception e) {
            System.out.println("Something went wrong" + e);
        }
        System.out.println(j);
        System.out.println("Bye");

    }
}
