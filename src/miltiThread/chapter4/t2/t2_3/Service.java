package miltiThread.chapter4.t2.t2_3;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/11/6 15:05
 */
public class Service  {
    private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
    public void read (){
        try {
            try {
                lock.readLock().lock();
                System.out.println("获得读锁  "+Thread.currentThread().getName()+"  "+System.currentTimeMillis());
                Thread.sleep(10000);
            } finally {
                lock.readLock().unlock();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
    public void write (){
        try {
            try {
                lock.writeLock().lock();
                System.out.println("获得写锁  "+Thread.currentThread().getName()+"  "+System.currentTimeMillis());
                Thread.sleep(10000);
            } finally {
                lock.writeLock().unlock();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
