package miltiThread.chapter4.t1.t1_6;




/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/11/5 14:37
 */
public class ThreadB extends Thread {
    private MyService myService = new MyService();

    public ThreadB(MyService myService) {
        super();
        this.myService = myService;
    }
    public void run(){
        myService.awaitB();
    }
}
