package miltiThread.chapter4.t1.t1_1;



/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/11/4 15:04
 */
public class Run {
    public static void main(String[] args) {
        MyService myService = new MyService();
        MyThread t1 = new MyThread(myService);
        MyThread t2 = new MyThread(myService);
        MyThread t3 = new MyThread(myService);
        MyThread t4 = new MyThread(myService);
        t1.start();t2.start();t3.start();t4.start();
    }
}
