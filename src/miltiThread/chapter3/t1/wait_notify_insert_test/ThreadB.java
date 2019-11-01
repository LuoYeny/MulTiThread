package miltiThread.chapter3.t1.wait_notify_insert_test;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/10/31 18:58
 */
public class ThreadB extends Thread {
    private ForDB2 forDB2;

    public ThreadB(ForDB2 forDB2) {
        super();
        this.forDB2 = forDB2;
    }
    public void run(){

     //   while (true){
            forDB2.db2Method();
   //     }
    }

}
