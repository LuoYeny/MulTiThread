package miltiThread.chapter1.t8.suspend_resume_LockStop;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/10/24 15:19
 */
public class Run {

    public static void main(String[] args) {
        try{

            MyThread thread = new MyThread();
            thread.start();
            Thread.sleep(1000);
            thread.suspend();
            System.out.println("main end");
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
