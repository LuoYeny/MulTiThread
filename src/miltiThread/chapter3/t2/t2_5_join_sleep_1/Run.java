package miltiThread.chapter3.t2.t2_5_join_sleep_1;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/11/1 15:19
 */
public class Run {
    public static void main(String[] args) {
        try {
            ThreadB b = new ThreadB();
            ThreadA a = new ThreadA(b);
            a.start();
            Thread.sleep(1000);
            ThreadC c = new ThreadC(b);
            c.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
