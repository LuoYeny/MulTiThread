package miltiThread.chapter3.t3.t3_2.t3_2_2;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/11/1 16:45
 */
public class Run {
    public static void main(String[] args) {
        try {
            ThreadA a = new ThreadA();
            a.start();
            Thread.sleep(1000);
            ThreadB b = new ThreadB();
            b.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
