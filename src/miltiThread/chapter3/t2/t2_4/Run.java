package miltiThread.chapter3.t2.t2_4;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/11/1 14:50
 */
public class Run {
    public static void main(String[] args) {
        try{
            MyThread myThread = new MyThread();
            myThread.start();
         //   myThread.join(2000);
            Thread.sleep(2000);
            System.out.println("main end time = "+System.currentTimeMillis());
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
