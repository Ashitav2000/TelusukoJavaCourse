public class RepeatedStringCount {
//    public static void main(String[] args) {
//            String input = "hello world";
//            int count = 0;
//
//            for (int i = 0; i < input.length(); i++) {
//                char c = input.charAt(i);
//                for (int j = i + 1; j < input.length(); j++) {
//                    if (c == input.charAt(j)) {
//                        count++;
//                        break; // Avoid counting the same character multiple times
//                    }
//                }
//            }
//
//            System.out.println("Repeated characters: " + count);
//        }
public static void main(String[] args) {
    String input = "hello world";

    for (int i = 0; i < input.length(); i++) {
        char c = input.charAt(i);
        int count = 0;

        for (int j = 0; j < input.length(); j++) {
            if (c == input.charAt(j)) {
                count++;
            }
        }

        System.out.println(c + " : " + count);
    }
}

}
