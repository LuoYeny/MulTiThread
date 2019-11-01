package miltiThread.chapter3.t1.wait_notify_insert_test;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/10/31 18:58
 */
public class ThreadA extends Thread {
    private ForDB1 forDB1;

    public ThreadA(ForDB1 forDB1) {
        super();
        this.forDB1 = forDB1;
    }
    public void run(){
       // while (true){
            forDB1.db1Method();
      //  }

    }

}
