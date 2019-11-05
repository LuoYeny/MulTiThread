package miltiThread.chapter4.t1.t1_16_condition123;

import miltiThread.chapter4.t1.t1_8.ThreadB;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/11/5 17:11
 */
public class Run {
    volatile public static int nextPrintWho=1;
    private static Lock lock = new ReentrantLock();
    final private static Condition conditionA =lock.newCondition();
    final private static Condition conditionB =lock.newCondition();
    final private static Condition conditionC =lock.newCondition();

    public static void main(String[] args) {
        Thread threadA = new Thread(){
            public void run(){
                try {
                    lock.lock();
                    while (nextPrintWho!=1){
                        conditionA.await();
                    }
                    for (int i = 0; i <3 ; i++) {
                        System.out.println("ThreadA_"+(i+1));
                    }
                    nextPrintWho=2;
                    conditionB.signalAll();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }
            }
        };
        Thread threadB = new Thread(){
            public void run(){
                try {
                    lock.lock();
                    while (nextPrintWho!=2){
                        conditionB.await();
                    }
                    for (int i = 0; i <3 ; i++) {
                        System.out.println("ThreadB_"+(i+1));
                    }
                    nextPrintWho=3;
                    conditionC.signalAll();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }
            }
        };
        Thread threadC = new Thread(){
            public void run(){
                try {
                    lock.lock();
                    while (nextPrintWho!=3){
                        conditionC.await();
                    }
                    for (int i = 0; i <3 ; i++) {
                        System.out.println("ThreadC_"+(i+1));
                    }
                    nextPrintWho=1;
                    conditionA.signalAll();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }
            }
        };
        Thread[] aArray =new Thread[5];
        Thread[] bArray =new Thread[5];
        Thread[] cArray =new Thread[5];

        for (int i = 0; i <5 ; i++) {
            aArray[i]=new Thread(threadA);
            bArray[i]=new Thread(threadB);
            cArray[i]=new Thread(threadC);
            aArray[i].start();
            bArray[i].start();
            cArray[i].start();



        }

    }
}

