package miltiThread.chapter3.t2.t2_6;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/11/1 15:49
 */
public class Run {
    public static void main(String[] args) {
        try{
            ThreadB b = new ThreadB();
            ThreadA a = new ThreadA(b);
            a.start();
            b.start();
            b.join(2000);
            System.out.println("main end  " +System.currentTimeMillis());
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
