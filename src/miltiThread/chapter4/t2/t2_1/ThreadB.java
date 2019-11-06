package miltiThread.chapter4.t2.t2_1;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/11/6 15:13
 */
public class ThreadB extends Thread {
    private Service service;

    public ThreadB(Service service) {
        super();
        this.service = service;
    }
    public void run(){
        service.read();
    }
}
