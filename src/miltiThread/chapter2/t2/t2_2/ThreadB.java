package miltiThread.chapter2.t2.t2_2;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/10/28 10:27
 */
public class ThreadB extends Thread {
    private Service service;
    public ThreadB(Service service){
        super();
        this.service=service;
    }
    public void run(){
        super.run();
        service.serviceMethod();
    }
}
