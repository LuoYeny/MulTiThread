package miltiThread.chapter3.t1.t1_11.t1_11_5;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/10/31 16:01
 */
public class PushThread extends Thread {
    private Producer producer;

    public PushThread(Producer producer) {
        super();
        this.producer = producer;
    }
    public void run(){
        while(true){
            producer.pushService();
        }
    }
}
