package miltiThread.chapter3.t2.t2_5_join_sleep_1;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/11/1 15:08
 */
public class ThreadB extends Thread {
    public void run(){
        try{
            System.out.println("b begin time = " +System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("b run end time = " +System.currentTimeMillis());

        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    synchronized public void bService(){
        System.out.println("打印了 bService time = "+System.currentTimeMillis());
    }
}
