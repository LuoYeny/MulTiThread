package miltiThread.chapter4.t1.t1_9Fair_notFait_test;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/11/5 15:54
 */
public class MyService {
    private ReentrantLock lock;
    public MyService(boolean isFair){
        super();
        lock=new ReentrantLock(isFair);
    }

    public void serviceMethod(){
        try {
            lock.lock();
            System.out.println("ThradName= "+Thread.currentThread().getName()+" 获得锁定");
        } finally {
            lock.unlock();
        }
    }
}
