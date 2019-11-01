package miltiThread.chapter3.t2.t2_5_join_sleep_1;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/11/1 15:08
 */
public class ThreadA extends Thread {
    private ThreadB b;

    public ThreadA(ThreadB b) {
        super();
        this.b = b;
    }
    public void run(){
        try{
            synchronized (b){
                b.start();
                Thread.sleep(6000);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
