package miltiThread.chapter3.t3.t3_2.t3_2_1;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/11/1 16:22
 */
public class ThreadB extends Thread {
    public void run(){
        try{
            for (int i = 0; i <100 ; i++) {
                Tools.t1.set("ThreadB-"+(i+1));
                System.out.println("ThreadB get value = "+Tools.t1.get());
                Thread.sleep(200);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
