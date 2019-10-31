package miltiThread.chapter2.t1.t1_6_synLockIn_2;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/10/24 19:28
 */
public class Main {
    public  int i= 10;
    synchronized public void operateIMainMethod(){
        try{
            i--;
            System.out.println("mian print i = "+i);
            Thread.sleep(100);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
