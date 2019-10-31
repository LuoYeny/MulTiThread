package miltiThread.chapter1.t8.suspend_resume_deal_lock;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/10/24 15:08
 */
public class SynchronizedObject {

    synchronized public void printString(){
        System.out.println("begin");
        if(Thread.currentThread().getName().equals("a")){
            System.out.println("线程a永远的suspend了");
            Thread.currentThread().suspend();
        }
        System.out.println("end");
    }
}
