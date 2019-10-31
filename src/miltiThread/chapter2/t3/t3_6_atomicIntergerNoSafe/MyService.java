package miltiThread.chapter2.t3.t3_6_atomicIntergerNoSafe;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/10/29 16:02
 */
public class MyService {
    public static AtomicLong aiRef = new AtomicLong();
    public void addNum(){
        System.out.println(Thread.currentThread().getName()+"加了100之后的值是 ："+aiRef.addAndGet(100));
        aiRef.addAndGet(1);

    }
}
