package miltiThread.chapter4.t2.t2_2;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/11/6 15:13
 */
public class ThreadA extends Thread {
    private Service service;

    public ThreadA(Service service) {
        super();
        this.service = service;
    }
    public void run(){
        service.write();
    }
}
