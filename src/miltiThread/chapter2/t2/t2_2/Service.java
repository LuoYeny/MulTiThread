package miltiThread.chapter2.t2.t2_2;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/10/28 10:08
 */
public class Service {
    public void serviceMethod(){
        try{
            synchronized (this){
                System.out.println("begin time ："+System.currentTimeMillis());
                Thread.sleep(2000);
                System.out.println("end time ："+System.currentTimeMillis());

            }
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }

}
