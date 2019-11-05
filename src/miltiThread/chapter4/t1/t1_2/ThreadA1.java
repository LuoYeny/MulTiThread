package miltiThread.chapter4.t1.t1_2;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/11/4 16:45
 */
public class ThreadA1 extends Thread {
    private MyService myService ;

    public ThreadA1(MyService myService) {
        super();
        this.myService = myService;
    }
     public void run(){
        myService.methodA();
     }
}
