package miltiThread.chapter3.t2.t2_4;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/11/1 14:48
 */
public class MyThread extends Thread {
    public void run(){
        try {
            System.out.println("begin time = "+System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("end time = "+System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
