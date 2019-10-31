package miltiThread.chapter1.t5_sleep;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/10/23 16:13
 */
public class MyThread1 extends  Thread {
    @Override
    public void run(){
        System.out.println("currentThread  "+this.currentThread().getName()+"begin  "+System.currentTimeMillis());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("currentThread  "+this.currentThread().getName()+"end  "+System.currentTimeMillis());
    }
}
