package miltiThread.chapter3.t2.t2_5_join_sleep_2;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/11/1 15:16
 */
public class ThreadC extends Thread {
    private ThreadB threadB;

    public ThreadC(ThreadB threadB) {
        super();
        this.threadB = threadB;
    }
    public void run(){

        threadB.bService();
    }
}
