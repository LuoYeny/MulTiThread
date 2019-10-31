package miltiThread.chapter1.t8.suspend_resume_nosameValue;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/10/24 15:41
 */
public class Run {
    public static void main(String[] args) {
        try {
            final MyObject myObject = new MyObject();
            Thread thread1 = new Thread(){
                public void run(){
                    myObject.setValue("a","a");
                }
            };
            thread1.setName("a");
            thread1.start();
            Thread.sleep(500);
            Thread thread2 =new Thread(){
                public void run(){
                    myObject.print();
                }
            };
            thread2.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
