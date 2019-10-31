package miltiThread.chapter2.t3.t3_6_atomicIntergerNoSafe;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/10/29 16:10
 */
public class MyThread extends Thread  {
    private MyService myService;

    public MyThread(MyService myService) {
        super();
        this.myService = myService;
    }
    public void run(){
        myService.addNum();
    }
}
