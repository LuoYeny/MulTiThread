package miltiThread.chapter2.t2.t2_6;



/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/10/28 10:30
 */
public class Run {
    public static void main(String[] args) {
        Service service =  new Service();
        ThreadA threadA =new ThreadA(service);
        threadA.start();
        ThreadB threadB = new ThreadB(service);
        threadB.start();
    }
}
