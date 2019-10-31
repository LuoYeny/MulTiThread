package miltiThread.chapter2.t2.t2_8.t2_8_test3;


/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/10/28 16:45
 */
public class Service {
    public void testMethod1(MyObject object){
        try {
            synchronized (object){
                System.out.println("testMethod1  ---getLock time= "
                        +System.currentTimeMillis()
                +"run thread name"
                +Thread.currentThread().getName());
                Thread.sleep(2000);
                System.out.println("testMethod1  ---getLock time= "
                        +System.currentTimeMillis()
                        +"run thread name"
                        +Thread.currentThread().getName());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
