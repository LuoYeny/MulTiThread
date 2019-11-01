package miltiThread.chapter3.t2.t2_3;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/11/1 11:23
 */
public class Run {
    public static void main(String[] args) {
        try{
            ThreadB b = new ThreadB();
            b.start();
            Thread.sleep(500);
            ThreadC c = new ThreadC(b);
            c.start();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
