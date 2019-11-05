package miltiThread.chapter4.t1.t1_2;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/11/4 16:58
 */
public class Run {
    public static void main(String[] args) {
        MyService myService = new MyService();
        ThreadA a = new ThreadA(myService);
        a.setName("a");
        a.start();
        ThreadA1 a1 = new ThreadA1(myService);
        a1.setName("a1");
        a1.start();
        ThreadB b = new ThreadB(myService);
        b.setName("b");
        b.start();
        ThreadB1 b1 = new ThreadB1(myService);
        b1.setName("b1");
        b1.start();


    }

}
