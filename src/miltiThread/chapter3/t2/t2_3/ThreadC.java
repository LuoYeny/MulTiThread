package miltiThread.chapter3.t2.t2_3;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/11/1 11:19
 */
public class ThreadC extends Thread {
    ThreadB threadB = new ThreadB();

    public ThreadC(ThreadB threadB) {
        super();
        this.threadB = threadB;
    }
    public void run(){
        threadB.interrupt();
    }
}
