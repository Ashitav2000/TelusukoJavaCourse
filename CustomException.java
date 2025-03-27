class AshitaException extends Exception{
    public AshitaException(String string){
        super(string);
    }
}
public class CustomException {
    public static void main(String[] args){
        int i = 20;
        int j = 0;

        try{
            j = 18/i;
            if(j==0){ // to create our own exception is done by creating a class and constructor
                throw new AshitaException("don't print zero");
            }
        }
        catch (AshitaException e) {
            j = 18/1;
            System.out.println("default output " + e);
        }
        catch (Exception e) {
            System.out.println("Something went wrong" + e);
        }

        System.out.println(j);

        System.out.println("Bye");
    }
}

