package miltiThread.chapter2.t3.t3_6_atomicIntergerNoSafe;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/10/29 16:11
 */
public class Run {
    public static void main(String[] args) {
        try{
            MyService myService = new MyService();
            MyThread[] myThreads =new MyThread[15];
            for (int i = 0; i <myThreads.length ; i++) {
                myThreads[i] = new MyThread(myService);

            }
            for (int i = 0; i <myThreads.length ; i++) {
                myThreads[i].start();

            }
            Thread.sleep(1000);
            System.out.println(MyService.aiRef.get());
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
