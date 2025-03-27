class AC extends Thread{
    public void run(){
        for(int i=0; i<=10;i++){
            System.out.println("Hii");
            // to make a thread to wait or sleep
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class AD extends Thread{
    public void run(){
        for(int i=0; i<=10;i++){
            System.out.println("Hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class MultiThread {
    public static void main(String[] args){
        AC obj1 = new AC();
        AD obj2 = new AD();

        // to set the priority of thread to maximum
        // obj2.setPriority(Thread.MAX_PRIORITY);

        //obj1.show();
        //to call or start a thread; start is a method belongs to thread class;
        obj1.start();
        try {
            Thread.sleep(2);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //obj2.show();
        obj2.start();
    }
}
