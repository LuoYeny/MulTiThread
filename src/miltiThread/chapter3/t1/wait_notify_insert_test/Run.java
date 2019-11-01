package miltiThread.chapter3.t1.wait_notify_insert_test;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/10/31 19:07
 */
public class Run {
    public static void main(String[] args) {
        MyDB myDB = new MyDB();
        ForDB1 forDB1 = new ForDB1(myDB);
        ForDB2 forDB2 = new ForDB2(myDB);
        for (int i = 0; i <10 ; i++) {
            ThreadA threadA = new ThreadA(forDB1);
            threadA.start();
            ThreadB threadB = new ThreadB(forDB2);
            threadB.start();

        }
    }
}
