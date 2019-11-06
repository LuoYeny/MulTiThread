package miltiThread.chapter4.t2.t2_3;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/11/6 15:14
 */
public class Run {
    public static void main(String[] args) {
        Service service = new Service();
        ThreadA a = new ThreadA(service);
        a.setName("A");
        ThreadB b = new ThreadB(service);
        b.setName("B");
        a.start();
        b.start();
    }
}
