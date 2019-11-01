package miltiThread.chapter3.t1.t1_11.t1_11_4;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/10/31 16:01
 */
public class PopThread extends Thread {
    private Consumer consumer;

    public PopThread(Consumer consumer) {
        super();
        this.consumer = consumer;
    }
    public void run(){
        while(true){
            consumer.pushService();
        }
    }
}
