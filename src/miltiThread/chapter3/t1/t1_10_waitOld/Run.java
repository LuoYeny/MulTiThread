package miltiThread.chapter3.t1.t1_10_waitOld;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/10/30 15:38
 */
public class Run {
    public static void main(String[] args) {
        try {
            String lock = new String("");
            Add add = new Add(lock);
            Subtract subtract =  new Subtract(lock);
            ThreadSubtract thread1Subtract = new ThreadSubtract(subtract);
            thread1Subtract.setName("sub_Thread1");
            thread1Subtract.start();
            ThreadSubtract thread2Subtract =new ThreadSubtract(subtract);
            thread2Subtract.setName("sub_Thread2");
            thread2Subtract.start();
            Thread.sleep(1000);
            ThreadAdd threadAdd = new ThreadAdd(add);
            threadAdd.setName("add_thread");
            threadAdd.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
