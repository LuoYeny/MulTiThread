package miltiThread.chapter2.t2.t2_8.t2_8_test3;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/10/28 16:47
 */
public class MyObject {
     public void speedPrintString(){

         synchronized (this){
             System.out.println("speedPrintString  ---getLock time= "
                     +System.currentTimeMillis()
                     +"run thread name"
                     +Thread.currentThread().getName());
             System.out.println("__________________________________________");
             System.out.println("speedPrintString  ---getLock time= "
                     +System.currentTimeMillis()
                     +"run thread name"
                     +Thread.currentThread().getName());
         }

    }
    }


