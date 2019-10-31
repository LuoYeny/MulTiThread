package miltiThread.chapter1.randomThread;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/10/23 10:18
 */
public class MyThread extends Thread {
    @Override
    public void run(){
        try {
            for (int i = 0; i <10 ; i++) {
            int time = (int)(Math.random()*1000);

                Thread.sleep(time);
                System.out.println("run1="+Thread.currentThread().getName());
                System.out.println("run2="+this.getName());


        }
            } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
