package miltiThread.chapter1.t9_yield;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/10/24 15:51
 */
public class Mythread  extends Thread{
    public void run(){
        long beginTime = System.currentTimeMillis();
        int count =0;
        for (int i = 0; i <50000000 ; i++) {
           // Thread.yield();
            count=count+(i+1);

        }
        long endTime =System.currentTimeMillis();
        System.out.println("time:"+(endTime-beginTime));
    }

}
