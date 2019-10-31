package miltiThread.chapter1.t8;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/10/23 19:39
 */
public class Run {

    public static void main(String[] args) {
        try{
        MyThread thread = new MyThread();
        thread.start();
        Thread.sleep(5000);
        //A段
            thread.suspend();
            System.out.println("A="+System.currentTimeMillis()+" i= "+thread.getI());
            Thread.sleep(5000);
            System.out.println("A="+System.currentTimeMillis()+" i= "+thread.getI());

            //B段
            thread.resume();
            Thread.sleep(5000);
            //c段
            thread.suspend();
            System.out.println("B="+System.currentTimeMillis()+" i= "+thread.getI());
            Thread.sleep(5000);
            System.out.println("B="+System.currentTimeMillis()+" i= "+thread.getI());
     }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
