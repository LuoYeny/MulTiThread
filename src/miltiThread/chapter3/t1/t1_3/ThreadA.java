package miltiThread.chapter3.t1.t1_3;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/10/30 9:50
 */
public class ThreadA extends  Thread {

    private Object lock;
    public ThreadA(Object lock) {
        super();
        this.lock = lock;
    }
    public void run(){
        try{


               synchronized (lock){
                   if(MyList.size()!=5){
                       System.out.println("wait begin "+System.currentTimeMillis());
                       lock.wait();
                       System.out.println("wait end "+System.currentTimeMillis());
                   }
               }


        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
