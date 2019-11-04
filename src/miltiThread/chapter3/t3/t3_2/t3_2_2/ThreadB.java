package miltiThread.chapter3.t3.t3_2.t3_2_2;

import java.util.Date;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/11/1 16:41
 */
public class ThreadB extends Thread {
    public void run(){
        try{
            for (int i = 0; i <20 ; i++) {
                if(Tools.t1.get()==null){
                    Tools.t1.set(new Date());
                }
                System.out.println("B "+Tools.t1.get().getTime());
                Thread.sleep(100);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
