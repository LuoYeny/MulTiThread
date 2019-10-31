package miltiThread.chapter3.t1.t1_8;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/10/30 14:39
 */
public class MyRunnable1 {
    static private Object lock = new Object();
    static private Runnable runable1 = new Runnable() {
        @Override
        public void run() {
            try {
                synchronized (lock){
                    System.out.println("wait begin "+System.currentTimeMillis());
                    lock.wait(5000);
                    System.out.println("wait end "+System.currentTimeMillis());
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    } ;


    static private Runnable runable2 = new Runnable() {
        @Override
        public void run() {

                synchronized (lock){
                    System.out.println("notify begin "+System.currentTimeMillis());
                    lock.notify();
                    System.out.println("notify end "+System.currentTimeMillis());
                }

        }
    } ;

    public static void main(String[] args) {
        try {
            Thread t =new Thread(runable1);
            t.start();
            Thread.sleep(3000);
            Thread t1 = new Thread(runable2);
            t1.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
