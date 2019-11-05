package miltiThread.chapter4.t1.t1_1;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/11/4 14:57
 */
public class MyService {
    private Lock lock = new ReentrantLock();
    public void testMethod(){
        for (int i = 0; i <5 ; i++) {
            System.out.println("ThreadName= "+Thread.currentThread().getName()+(""+(i+1)));

        }
    }
}
