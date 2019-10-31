package miltiThread.chapter3.t1.t1_10_waitOld;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/10/30 15:19
 */
public class Add {
    private String lock;

    public Add(String lock) {
        this.lock = lock;
    }
    public void add(){
        synchronized (lock){
            ValueObject.list.add("any thing");
            lock.notifyAll();
        }
    }
}
