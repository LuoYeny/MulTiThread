package miltiThread.chapter3.t2.t2_3;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/11/1 11:10
 */
public class ThreadB extends Thread {
    public void run(){
        try {
            ThreadA a = new ThreadA();
            a.start();
            a.join();
            System.out.println("线程B在run end 处打印了");
        } catch (InterruptedException e) {
            System.out.println("线程B在catch 处打印了");
            e.printStackTrace();
        }
    }
}
