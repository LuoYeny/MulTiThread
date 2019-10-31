package miltiThread.chapter1.t5_sleep;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/10/23 16:11
 */
public class Run1 {

    public static void main(String[] args) {
        MyThread thread = new MyThread();
        System.out.println("begin"+System.currentTimeMillis());
        thread.run();
        System.out.println("end  "+System.currentTimeMillis());

    }
}
