package miltiThread.chapter4.t1.t1_7;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/11/5 15:27
 */
public class Run {
    public static void main(String[] args) {
        MyService service = new MyService();
        ThreadA a  =new ThreadA(service);
        a.start();
        ThreadB b =new ThreadB(service);
        b.start();
    }
}
