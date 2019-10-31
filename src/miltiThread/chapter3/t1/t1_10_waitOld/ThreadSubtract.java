package miltiThread.chapter3.t1.t1_10_waitOld;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/10/30 15:35
 */
public class ThreadSubtract extends Thread {
    private Subtract r;

    public ThreadSubtract(Subtract r) {
        super();
        this.r = r;
    }
    public void run(){
        r.subtract();
    }
}
