package miltiThread.chapter3.t1.t1_10_waitOld;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/10/30 15:34
 */
public class ThreadAdd extends Thread {
    private Add p;

    public ThreadAdd(Add p) {
        super();
        this.p = p;
    }
    public void run(){
        p.add();
    }
}
