package miltiThread.chapter3.t1.t1_11.t1_11_2;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/10/30 16:12
 */
public class Consumer {
    private String lock;

    public Consumer(String lock) {
        super();
        this.lock = lock;
    }
    public void getValue(){
        try {
            synchronized (lock){
                if(ValueObject.value.equals("")){
                    System.out.println("消费者  "+Thread.currentThread().getName()+" waiting  ..");
                    lock.wait();

                }
                System.out.println("消费者  "+Thread.currentThread().getName()+" running  ..");
          //      System.out.println("get的值是  "+ ValueObject.value);
                ValueObject.value="";
                lock.notifyAll();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
