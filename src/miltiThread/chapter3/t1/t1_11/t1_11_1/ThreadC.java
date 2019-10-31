package miltiThread.chapter3.t1.t1_11.t1_11_1;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/10/30 16:18
 */
public class ThreadC extends Thread {
    private Consumer consumer;

    public ThreadC(Consumer consumer) {
        super();
        this.consumer = consumer;
    }
    public void run(){

            consumer.getValue();

    }
}
