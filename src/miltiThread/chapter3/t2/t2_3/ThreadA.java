package miltiThread.chapter3.t2.t2_3;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/11/1 11:17
 */
public class ThreadA extends  Thread {
    public void run(){
        for (int i = 0; i <Integer.MAX_VALUE ; i++) {
            String newString = new String();
            Math.random();
        }
    }
}
