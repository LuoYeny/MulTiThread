package miltiThread.chapter1.t8.suspend_resume_deal_lock;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/10/24 15:11
 */
public class Run {

    public static void main(String[] args) {
        try{
            final SynchronizedObject object =new SynchronizedObject();
            Thread thread1 = new Thread(){
                @Override
                public void run(){
              object.printString();
                }
            };
            thread1.setName("a");
            thread1.start();
            Thread.sleep(1000);

            Thread thread2 =new Thread(){
                @Override
                public void run(){
                    System.out.println("线程2启动了");
                    object.printString();
                }
            };
            thread2.start();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
