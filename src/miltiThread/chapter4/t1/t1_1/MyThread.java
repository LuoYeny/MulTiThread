package miltiThread.chapter4.t1.t1_1;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/11/4 15:03
 */
public class MyThread extends Thread {
    private MyService service;

    public MyThread(MyService service) {
        super();
        this.service = service;
    }
    public void run(){
        service.testMethod();
    }
}
