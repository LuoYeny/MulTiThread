package miltiThread.chapter3.t2.t2_6;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/11/1 15:45
 */
public class ThreadB extends Thread {
    synchronized public void run(){
        try{
            System.out.println("b begin name = " +Thread.currentThread().getName()+System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("b end name = " +Thread.currentThread().getName()+System.currentTimeMillis());
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
