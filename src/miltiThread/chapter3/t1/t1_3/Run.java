package miltiThread.chapter3.t1.t1_3;



/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/10/30 10:00
 */
public class Run {
    public static void main(String[] args) {
        try {
            Object service = new Object();
            ThreadA a = new ThreadA(service);
            a.setName("A");
            a.start();
            Thread.sleep(50);
            ThreadB b = new ThreadB(service);
            b.setName("B");
            b.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
