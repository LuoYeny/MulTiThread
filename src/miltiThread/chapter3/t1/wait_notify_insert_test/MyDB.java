package miltiThread.chapter3.t1.wait_notify_insert_test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/10/31 18:33
 */
public class MyDB {
    public static boolean flag = false;
    private Object lock = new Object();
    public void db1(){
        try{
            synchronized (lock){
                while(flag==true){
                    lock.wait();
                }
                for (int i = 0; i <5 ; i++) {
                    System.out.println("★★★★★");
                }
                 flag =true;
                 lock.notifyAll();
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }


    }
    public void db2(){
        try{
            synchronized (lock){
                while(flag==false){
                    lock.wait();
                }
                for (int i = 0; i <5 ; i++) {
                    System.out.println("☆☆☆☆☆");
                }
                flag =false;
                lock.notifyAll();
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }


    }


}
