package miltiThread.chapter2.t1.t1_1;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/10/24 16:30
 */
public class ThreadA extends Thread {

    private HasSelfPrivateNum numRef;
    public ThreadA (HasSelfPrivateNum numRef){
        super();
        this.numRef=numRef;
    }
    public void run(){
        super.run();
        numRef.addI("a");
    }
}
