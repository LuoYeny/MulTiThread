package miltiThread.chapter3.t1.t1_10_waitOld;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/10/30 15:22
 */
public class Subtract {
    private String lock;

    public Subtract(String lock) {
        this.lock = lock;
    }

    public void subtract(){
        try {
            synchronized (lock){
                while ( ValueObject.list.size()==0){
                    System.out.println("wait begin thread name  =  "+Thread.currentThread().getName() );
                    lock.wait();
                    System.out.println("wait end thread name  =  "+Thread.currentThread().getName() );
                }
                ValueObject.list.remove(0);
                System.out.println("list size = "+ValueObject.list.size());
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
