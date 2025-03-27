public class StringBufferBuilder {
    public static void main(String[] args){
        // String buffer is mutable and allow to change the string
        StringBuffer sb = new StringBuffer("Ashita"); //String Buffer gives you a size which is of 16 bytes
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        System.out.println(sb.append(" Vemulapalli"));
        System.out.println(sb.insert(7," JAVA "));
        System.out.println(sb.deleteCharAt(2));


    }

}
