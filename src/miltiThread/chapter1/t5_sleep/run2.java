package miltiThread.chapter1.t5_sleep;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/10/23 16:17
 */
public class run2 {
    public static void main(String[] args) {
        MyThread1 thread = new MyThread1();
        System.out.println("begin"+System.currentTimeMillis());
        thread.start();
        System.out.println("end  "+System.currentTimeMillis());

    }
}
