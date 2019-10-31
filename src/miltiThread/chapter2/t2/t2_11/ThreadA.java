package miltiThread.chapter2.t2.t2_11;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/10/29 9:50
 */
public class ThreadA extends Thread {
    private Service service;

    public ThreadA(Service service) {
        super();
        this.service = service;

    }
    public void run(){
        service.methodA();
    }

}
