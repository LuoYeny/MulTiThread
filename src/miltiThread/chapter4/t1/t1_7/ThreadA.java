package miltiThread.chapter4.t1.t1_7;




/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/11/5 14:37
 */
public class ThreadA extends Thread {
    private MyService myService = new MyService();

    public ThreadA(MyService myService) {
        super();
        this.myService = myService;
    }
    public void run() {
        for (int i = 0; i <20 ; i++) {
            myService.set();
        }
    }
}
