package miltiThread.chapter4.t1.t1_7;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/11/5 15:16
 */
public class MyService {
    private Lock lock =new ReentrantLock();
    private Condition condition =lock.newCondition();
    private boolean hasValue = false;
    public  void set (){
        try {
            lock.lock();
            while (hasValue==true){
                condition.await();
            }
            System.out.println("**");
            hasValue=true;
            condition.signal();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
    public  void get (){
        try {
            lock.lock();
            while (hasValue==false){
                condition.await();
            }
            System.out.println("--");
            hasValue=false;
            condition.signal();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
}
