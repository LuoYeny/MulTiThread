package miltiThread.chapter3.t1.t1_11.t1_11_2;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/10/30 16:16
 */
public class ThreadP extends Thread{
    private Producer producer;

    public ThreadP(Producer producer) {
        super();
        this.producer = producer;
    }
    public void run(){

        while(true){
            producer.setValue();
        }


    }
}
