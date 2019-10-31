package miltiThread.chapter2.t1.t1_3_towLock;

import miltiThread.chapter2.t1.t1_1.HasSelfPrivateNum;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/10/24 16:30
 */
public class ThreadB extends Thread {

    private HasSelfPrivateNum numRef;
    public ThreadB(HasSelfPrivateNum numRef){
        super();
        this.numRef=numRef;
    }
    public void run(){
        super.run();
        numRef.addI("b");
    }
}
