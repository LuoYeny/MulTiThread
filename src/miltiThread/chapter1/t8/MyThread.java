package miltiThread.chapter1.t8;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/10/23 19:32
 */
public class MyThread extends Thread {
    private long i = 0;

    public long getI() {
        return i;
    }

    public void setI(long i) {
        this.i = i;
    }
    @Override
    public void run(){
        while (true){
            i++;
        }
    }
}
