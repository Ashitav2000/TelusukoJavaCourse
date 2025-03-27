class At{
    public void show() throws ClassNotFoundException{
        Class.forName("Strings");
    }
}

public class ThrowsKeyword {
    static{
        System.out.println("Class loaded");
    }
    public static void main(String[] args){
        At aa = new At();

        try{
            aa.show();
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
