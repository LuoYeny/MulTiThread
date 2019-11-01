package miltiThread.chapter3.t1.t1_11.t1_11_5;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/10/31 16:08
 */
public class Run {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        Producer producer = new Producer(myStack);
        Consumer consumer1 = new Consumer(myStack);
        Consumer consumer2 = new Consumer(myStack);
        Consumer consumer3 = new Consumer(myStack);
        Consumer consumer4 = new Consumer(myStack);
        Consumer consumer5 = new Consumer(myStack);

        PushThread pushThread = new PushThread(producer);
        PopThread popThread1 = new PopThread(consumer1);
        PopThread popThread2= new PopThread(consumer2);
        PopThread popThread3 = new PopThread(consumer3);
        PopThread popThread4 = new PopThread(consumer4);
        PopThread popThread5 = new PopThread(consumer5);
        pushThread.start();

        popThread1.start();
        popThread2.start();
        popThread3.start();
        popThread4.start();
        popThread5.start();



    }
}
