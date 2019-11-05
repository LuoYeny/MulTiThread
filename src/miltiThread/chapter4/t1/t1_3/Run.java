package miltiThread.chapter4.t1.t1_3;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/11/5 14:40
 */
public class Run {
    public static void main(String[] args) {
        MyService service = new MyService();
        ThreadA threadA = new ThreadA(service);
        threadA.start();
    }
}
