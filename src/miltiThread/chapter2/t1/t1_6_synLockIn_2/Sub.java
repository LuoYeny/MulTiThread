package miltiThread.chapter2.t1.t1_6_synLockIn_2;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/10/24 19:31
 */
public class Sub extends Main {
    @Override
    public synchronized void operateIMainMethod() {
        try{
            while (i>0){
                i--;
                System.out.println("sub print i = "+i);
                Thread.sleep(100);
                super.operateIMainMethod();
            }

        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
