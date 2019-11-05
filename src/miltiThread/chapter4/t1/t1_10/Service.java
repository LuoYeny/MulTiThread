package miltiThread.chapter4.t1.t1_10;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/11/5 16:18
 */
public class Service {
    private ReentrantLock lock = new ReentrantLock();
    public void serviceMethod1(){
        try {
            lock.lock();
            System.out.println("serviceMethod1 getHoldCount = "+lock.getHoldCount());
            serviceMethod2();
        } finally {
            lock.unlock();
        }
    }

    public void serviceMethod2() {
        try {
            lock.lock();
            System.out.println("serviceMethod2 getHoldCount = "+lock.getHoldCount());

        } finally {
            lock.unlock();
        }
    }
}
