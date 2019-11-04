package miltiThread.chapter3.t3.t3_4;

import java.util.Date;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/11/4 11:11
 */
public class ThreadLocalExt extends ThreadLocal {
    @Override
    protected Object initialValue() {
        return  new Date().getTime();
    }
}
