package miltiThread.chapter2.t2.t2_8.t2_8_synchronizedBlockAll;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/10/28 17:00
 */
public class Run {
    public static void main(String[] args) {
        Service service =new Service();
        MyObject object =new MyObject();
        Thread1 thread1 =new Thread1(service,object);
        thread1.setName("a");
        thread1.start();
        Thread2 thread2 =new Thread2(service,object);
        thread2.setName("b");
        thread2.start();

    }
}
