package miltiThread.chapter3.t2.t2_5_join_sleep_2;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/11/1 15:08
 */
public class ThreadA extends Thread {
    private ThreadB b;

    public ThreadA(ThreadB b) {
        super();
        this.b = b;
    }
    public void run(){
        try{
            synchronized (b){
                b.start();
                b.join();
                for (int i = 0; i <Integer.MAX_VALUE ; i++) {
                    String newString = new String();
                    Math.random();

                }
            }

        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
