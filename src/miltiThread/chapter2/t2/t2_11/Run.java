package miltiThread.chapter2.t2.t2_11;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/10/29 9:52
 */
public class Run {
    public static void main(String[] args) {
        Service service = new Service();
        ThreadA threadA =new ThreadA(service);
        threadA.start();
        ThreadB threadB = new ThreadB(service);
        threadB.start();
    }
}
