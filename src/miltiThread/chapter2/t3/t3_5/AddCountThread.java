package miltiThread.chapter2.t3.t3_5;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/10/29 15:46
 */
public class AddCountThread extends Thread {
    private AtomicInteger count = new AtomicInteger(0);
    public void run(){
        for (int i = 0; i <10000 ; i++) {
            System.out.println(Thread.currentThread().getName()+"  :"+count.incrementAndGet());

        }
    }

}
