package miltiThread.chapter3.t1.t1_1;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/10/30 10:00
 */
public class Run {
    public static void main(String[] args) {
        MyList service = new MyList();
        ThreadA a = new ThreadA(service);
        a.setName("A");
        a.start();
        ThreadB b = new ThreadB(service);
        b.setName("B");
        b.start();
    }
}
