package miltiThread.chapter3.t1.t1_11.t1_11_1;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/10/30 16:19
 */
public class Run {
    public static void main(String[] args) {
        String lock = new String("");
        Producer producer = new Producer(lock);
        Consumer consumer = new Consumer(lock);
        ThreadP threadP = new ThreadP(producer);
        ThreadC threadC =new ThreadC(consumer);
        threadC.start();
        threadP.start();
    }
}
