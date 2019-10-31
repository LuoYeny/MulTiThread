package miltiThread.chapter2.t1.t1_9_synNotExtends;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/10/24 20:05
 */
public class Main {

    synchronized public void serviceMethod(){
        try{
            System.out.println("int main next step  begin threadName = "
            +Thread.currentThread().getName()
            +"time= "+System.currentTimeMillis());

            Thread.sleep(5000);
            System.out.println("int main next step  end threadName = "
                    +Thread.currentThread().getName()
                    +"time= "+System.currentTimeMillis());
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
