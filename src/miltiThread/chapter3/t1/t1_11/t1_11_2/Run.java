package miltiThread.chapter3.t1.t1_11.t1_11_2;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/10/30 16:40
 */
public class Run {
    public static void main(String[] args) {
        try {
            String lock = new String("");
            Producer producer = new Producer(lock);
            Consumer consumer = new Consumer(lock);
            ThreadP[] threadP = new ThreadP[2];
            ThreadC[] threadC =new ThreadC[2];
            for (int i = 0; i <2 ; i++) {
                threadP[i] = new ThreadP(producer);
                threadP[i].setName("生产者_"+(i+1));
                threadC[i] = new ThreadC(consumer);
                threadC[i].setName("消费者_"+(i+1));
                threadC[i].start();
                threadP[i].start();
            }
            Thread.sleep(5000);
            Thread[] threadArray =new Thread[Thread.currentThread().getThreadGroup().activeCount()];
            Thread.currentThread().getThreadGroup().enumerate(threadArray);
            System.out.println(threadArray);
            for (int i = 0; i <threadArray.length ; i++) {
                System.out.println(threadArray[i].getName()+"  "+threadArray[i].getState());

            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
