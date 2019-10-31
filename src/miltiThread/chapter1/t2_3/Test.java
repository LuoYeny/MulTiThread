package miltiThread.chapter1.t2_3;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/10/23 15:05
 */
public class Test  {
    public static void main1(String[] args) {
//        MyThread thread1 = new MyThread("a");
//        MyThread thread2 = new MyThread("b");
//        MyThread thread3 = new MyThread("c");
//        MyThread thread4 = new MyThread("d");
//        MyThread thread5 = new MyThread("e");
//
//        thread1.start();
//        thread2.start();
//        thread3.start();
//        thread4.start();
//        thread5.start();
    }

    public static void main(String[] args) {
        MyThread myThread = new MyThread( );
        Thread thread1= new Thread(myThread,"a");
        Thread thread2= new Thread(myThread,"b");
        Thread thread3= new Thread(myThread,"c");
        Thread thread4= new Thread(myThread,"d");
        Thread thread5= new Thread(myThread,"e");

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();

    }
}
