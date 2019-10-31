package miltiThread.chapter1.randomThread;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/10/23 10:29
 */
public class Test {

    public static void main1(String [] args){
        try{
        MyThread thread = new MyThread();
        thread.setName("myThread");
        thread.start();

        for (int i = 0; i <10 ; i++) {
            int time = (int)(Math.random()*1000);
            Thread.sleep(time);
            System.out.println("main="+Thread.currentThread().getName());
        }
         }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        MyRunableThread runableThread = new MyRunableThread();
        Thread thread = new Thread(runableThread,"runable");
        thread.start();
    }
}
