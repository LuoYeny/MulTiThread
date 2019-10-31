package miltiThread.chapter2.t1.t1_6_synLockIn_2;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/10/24 19:34
 */
public class MyThread extends Thread {
    public void run(){
        Sub sub =new Sub();
        sub.operateIMainMethod();
    }
}
