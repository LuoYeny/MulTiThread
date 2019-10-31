package miltiThread.chapter1.t4_isAlive;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/10/23 15:05
 */
public class Test {


    public static void main(String[] args) {
        CountOperate myThread = new CountOperate( );
        Thread thread1= new Thread(myThread,"a");
        System.out.println("thread1.isAlive()  "+thread1.isAlive());

        thread1.start();
        System.out.println("main end  thread1.isAlive()  "+thread1.isAlive());


    }
}
