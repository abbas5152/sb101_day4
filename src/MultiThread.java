//Q1)Make a thread that will calculate a product of 1
//        to 10 and another thread (main thread ) will print
//        the calculated value of the first thread.


public class MultiThread {

    public static void main(String[] args) {
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println((10*11)/2);
            }
        });
        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                t1.start();
            }
        });
        t2.start();
    }
}
