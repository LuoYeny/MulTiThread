package miltiThread.chapter2.t1.t1_9_synNotExtends;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/10/24 20:10
 */
public class ThreadB extends Thread {
    private Sub sub;

    public ThreadB(Sub sub) {
        super();
        this.sub = sub;
    }
    public void run(){
        sub.serviceMethod();
    }
}
