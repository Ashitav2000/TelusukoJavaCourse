public class WrapperClass {
    public static void main(String[] args){
        int num = 8;
        //Integer is a class of int
        //Integer num1 = new Integer(9);
        //Integer num1 = new Integer(num); //boxing
        Integer num1 = num; //auto-boxing: storing a primitive type in the object automatically
        int num2 = num1.intValue();//auto-unboxing: taking out the primitive value from the object
        System.out.println(num2);

        String str = "14";
        //converts string to integer
        int num3 = Integer.parseInt(str);
        System.out.println(num3*4);
    }
}
