package miltiThread.chapter1.t7.interrupt;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/10/23 16:37
 */
public class MyThread extends Thread {

    @Override
    public void run (){
        super.run();
        for (int i = 0; i < 30000; i++) {

            System.out.println("i="+(i+1));

        }
    }
}
