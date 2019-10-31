package miltiThread.chapter3.t1.t1_11.t1_11_1;

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
                    System.out.println("c wait");
                    lock.wait();
                    System.out.println("c wait end");
                }
                System.out.println("get的值是  "+ValueObject.value);
                ValueObject.value="";
                lock.notify();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
