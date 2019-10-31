package miltiThread.chapter2.t1.t1_5_dirtyRead;



/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/10/24 16:30
 */
public class ThreadA extends Thread {

    private PublicVar publicVar;
    public ThreadA(PublicVar publicVar){
        super();
        this.publicVar=publicVar;
    }
    public void run(){
        super.run();
        publicVar.setValue("B","BB");
    }
}
