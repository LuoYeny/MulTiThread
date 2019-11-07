package miltiThread.chapter6.t3;

import miltiThread.chapter6.t2.t2_2.MyObject;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/11/7 16:03
 */
public class MyThread extends Thread {
    public void run(){
        System.out.println(MyObject.getInstance().hashCode());
    }
}
