package miltiThread.chapter3.t2.t2_6;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/11/1 15:45
 */
public class ThreadA extends Thread {
    private ThreadB b;

    public ThreadA(ThreadB b) {
        super();
        this.b = b;
    }
     public void run(){
        synchronized (b){
            try{
                System.out.println("a begin name = " +Thread.currentThread().getName()+System.currentTimeMillis());
                Thread.sleep(5000);
                System.out.println("a end name = " +Thread.currentThread().getName()+System.currentTimeMillis());
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }

    }
}
