package miltiThread.chapter3.t1.t1_8;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/10/30 14:39
 */
public class MyRunnable {
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

    public static void main(String[] args) {
        Thread t =new Thread(runable1);
        t.start();
    }
}
