package miltiThread.chapter2.t3.t3_4;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/10/29 15:19
 */
public class MyThread extends Thread {
    volatile public static int count ;
    synchronized private static void addCount(){
        for (int i = 0; i <100 ; i++) {
            count++;
        }
        System.out.println("threadname : "+Thread.currentThread().getName()+"   count = "+count);

    }
    public void run(){
        addCount();
    }
}
