package miltiThread.chapter2.t3.t3_4;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/10/29 15:22
 */
public class Run {
    public static void main(String[] args) {
        MyThread [] myThreads = new MyThread[100];
        for (int i = 0; i <100 ; i++) {
            myThreads[i] = new MyThread();
        }
        for (int i = 0; i <100 ; i++) {
            myThreads[i].start();

        }
    }
}
