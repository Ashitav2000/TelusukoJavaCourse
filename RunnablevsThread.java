//class AE implements Runnable{
//    public void run(){
//        for(int i=0; i<=15;i++){
//            System.out.println("Hii");
//            try {
//                Thread.sleep(10);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//    }
//}
//class AF implements Runnable{
//    public void run(){
//        for(int i=0; i<=5;i++){
//            System.out.println("Hello");
//            try {
//                Thread.sleep(10);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//    }
//}
public class RunnablevsThread {
    public static void main(String[] args){
        //Runnable obj1 = new AE();
        Runnable obj1 = () -> {
                for (int i = 0; i <= 5; i++) {
                    System.out.println("Hii");
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            };
        Runnable obj2 = () -> {
            for (int i = 0; i <= 5; i++) {
                System.out.println("Hello");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
    }
}
