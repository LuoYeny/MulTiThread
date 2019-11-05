package miltiThread.chapter4.t1.t1_5;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/11/5 14:46
 */
public class MyService {
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();
    public void await(){
        try {
            lock.lock();
            System.out.println("begin await 的时间是  "+System.currentTimeMillis()+
                    " ThreadName = "+Thread.currentThread().getName());
            condition.await();
            System.out.println("end await 的时间是  "+System.currentTimeMillis()+
                    " ThreadName = "+Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
            System.out.println(" await锁释放了");
        }
    }
    public void awaitB(){
        try {
            lock.lock();
            System.out.println("begin awaitB 的时间是  "+System.currentTimeMillis()+
                    " ThreadName = "+Thread.currentThread().getName());
            condition.await();
            System.out.println("end awaitB 的时间是  "+System.currentTimeMillis()+
                    " ThreadName = "+Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
            System.out.println(" awaitB锁释放了");
        }
    }
    public void signal(){
        try {
            lock.lock();
            System.out.println("begin signal 的时间是  "+System.currentTimeMillis()+
                    " ThreadName = "+Thread.currentThread().getName());
            condition.signalAll();
            System.out.println("end signal 的时间是  "+System.currentTimeMillis()+
                    " ThreadName = "+Thread.currentThread().getName());
        }finally {
            lock.unlock();
            System.out.println("signal 锁释放了");
        }
    }
}
