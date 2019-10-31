package miltiThread.chapter1.t3;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/10/23 15:05
 */
public class Test  {


    public static void main(String[] args) {
        MyThread myThread = new MyThread( );
        Thread thread1= new Thread(myThread,"a");


        thread1.start();
        myThread.test();

    }
}
