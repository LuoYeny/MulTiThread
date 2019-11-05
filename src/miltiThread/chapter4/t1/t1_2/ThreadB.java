package miltiThread.chapter4.t1.t1_2;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/11/4 16:45
 */
public class ThreadB extends Thread {
    private MyService myService ;

    public ThreadB(MyService myService) {
        super();
        this.myService = myService;
    }
     public void run(){
        myService.methodB();
     }
}
