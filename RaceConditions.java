class Thres{
    int count;
    // to make the method is called one object, we use synchronized
    public synchronized void increment(){
        count++;
    }
}
public class RaceConditions {
    public static void main(String[] args) throws InterruptedException {
        Thres c = new Thres();
        Runnable obj1 = () -> {
            for (int i = 1; i <= 1000; i++) {
                c.increment();
            }
        };
        Runnable obj2 = () -> {
            for (int i = 1; i <= 1000; i++) {
                c.increment();
            }
        };
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
        // to get total counts to be joined
        t1.join();
        t2.join();
        System.out.println(c.count);
    }
}
