package miltiThread.chapter3.t1.t1_11.t1_11_1;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/10/30 15:55
 */
public class Producer {
    private String lock;

    public Producer(String lock) {
        this.lock = lock;
    }
    public void setValue(){
        try{
            synchronized (lock){
                if(!ValueObject.value.equals("")){
                    System.out.println("p wait");
                    lock.wait();
                    System.out.println("p wait end");
                }
                String value = System.currentTimeMillis()+"_"+System.nanoTime();
                System.out.println("set 的值是  "+value);
                ValueObject.value =value;
                lock.notify();
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
