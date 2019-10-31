package miltiThread.chapter2.t2.t2_11;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/10/29 9:46
 */
public class Service {
    synchronized public void methodA(){
        System.out.println("methodA begin");
        boolean isContinuRun = true;
        while(isContinuRun){

        }
        System.out.println("methodA end");
    }
    synchronized public void methodB(){
        System.out.println("methodB begin");

        System.out.println("methodBend");
    }

}
