package miltiThread.chapter3.t2.t2_1;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/11/1 10:59
 */
public class Mythread extends Thread {
   public void run(){
       try{
           int secondValue = (int)(Math.random()*10000);
           System.out.println(secondValue);
           Thread.sleep(secondValue);

       }catch (InterruptedException e){
           e.printStackTrace();
       }
   }
}
