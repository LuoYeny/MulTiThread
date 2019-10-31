package miltiThread.chapter3.t1.t1_11.t1_11_2;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/10/30 15:55
 */
public class Producer {
    private String lock;

    public Producer(String lock) {
        super();
        this.lock = lock;
    }
    public void setValue(){
        try{
            synchronized (lock){
                while (!ValueObject.value.equals("")){
                    System.out.println("生产者  "+Thread.currentThread().getName()+" waiting  ..");
                    lock.wait();

                }
                System.out.println("生产者  "+Thread.currentThread().getName()+" running  ..");
                String value = System.currentTimeMillis()+"_"+System.nanoTime();
         //       System.out.println("set 的值是  "+value);
                ValueObject.value =value;
                lock.notifyAll();
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
