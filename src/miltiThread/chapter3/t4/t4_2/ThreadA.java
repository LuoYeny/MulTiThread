package miltiThread.chapter3.t4.t4_2;

import miltiThread.chapter3.t3.t3_4.Tools;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/11/4 11:16
 */
public class ThreadA extends Thread {
    public void run(){
        try{
            for (int i = 0; i <10 ; i++) {
                System.out.println("在线程threadA中取值 = "+Tools.t1.get());
                Thread.sleep(100);

            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
