package miltiThread.chapter6.t2.t2_2;


/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/11/7 16:08
 */
public class Run {
    public static void main(String[] args) {
        MyThread t1 =new MyThread();
        MyThread t2 =new MyThread();
        MyThread t3 =new MyThread();
        t1.start();
        t2.start();
        t3.start();
    }
}
