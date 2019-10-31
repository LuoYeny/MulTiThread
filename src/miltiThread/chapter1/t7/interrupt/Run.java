package miltiThread.chapter1.t7.interrupt;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/10/23 16:39
 */
public class Run {

    public static void main(String[] args) {
        try{
            MyThread myThread =new MyThread();
            myThread.start();
           Thread.sleep(5000 );
            myThread.interrupt();
           //   Thread.currentThread().interrupt();
            System.out.println("是否停止 " + myThread.interrupted());
            System.out.println("是否停止 " + myThread.interrupted());
        }catch(InterruptedException e){
            System.out.println("main catch");
            e.printStackTrace();
        }
    }
}
