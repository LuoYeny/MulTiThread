package miltiThread.chapter4.t1.t1_6;

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
    private Condition conditionA = lock.newCondition();
    private Condition conditionB= lock.newCondition();
    public void awaitA(){
        try {
            lock.lock();
            System.out.println("begin awaitA 的时间是  "+System.currentTimeMillis()+
                    " ThreadName = "+Thread.currentThread().getName());
            conditionA.await();
            System.out.println("end awaitA 的时间是  "+System.currentTimeMillis()+
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
            conditionB.await();
            System.out.println("end awaitB 的时间是  "+System.currentTimeMillis()+
                    " ThreadName = "+Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
            System.out.println(" awaitB锁释放了");
        }
    }
    public void signalAll_A(){
        try {
            lock.lock();
            System.out.println("begin signalA 的时间是  "+System.currentTimeMillis()+
                    " ThreadName = "+Thread.currentThread().getName());
            conditionA.signalAll();
            System.out.println("end signalA 的时间是  "+System.currentTimeMillis()+
                    " ThreadName = "+Thread.currentThread().getName());
        }finally {
            lock.unlock();
            System.out.println("signalA 锁释放了");
        }
    }
    public void signalAll_B(){
        try {
            lock.lock();
            System.out.println("begin signalB 的时间是  "+System.currentTimeMillis()+
                    " ThreadName = "+Thread.currentThread().getName());
            conditionA.signalAll();
            System.out.println("end signalB 的时间是  "+System.currentTimeMillis()+
                    " ThreadName = "+Thread.currentThread().getName());
        }finally {
            lock.unlock();
            System.out.println("signalB 锁释放了");
        }
    }
}
