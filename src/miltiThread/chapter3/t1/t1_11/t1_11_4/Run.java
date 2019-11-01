package miltiThread.chapter3.t1.t1_11.t1_11_4;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/10/31 16:08
 */
public class Run {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        Producer producer = new Producer(myStack);
        Consumer consumer = new Consumer(myStack);
        PushThread pushThread = new PushThread(producer);
        PopThread popThread = new PopThread(consumer);
        pushThread.start();

        popThread.start();

    }
}
