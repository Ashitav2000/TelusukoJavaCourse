public class ThrowKeyword {
    public static void main(String[] args){
        int i = 20;
        int j = 0;

        try{
            j = 18/i;
            if(j==0){ // new ArithmeticException() is the object
                throw new ArithmeticException("don't print zero");
            }
        }
        catch (ArithmeticException e) {
            j = 18/1;
            System.out.println("default output" + e);
        }
        catch (Exception e) {
            System.out.println("Something went wrong" + e);
        }

        System.out.println(j);

        System.out.println("Bye");
    }
}
