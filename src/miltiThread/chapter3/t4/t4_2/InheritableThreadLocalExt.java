package miltiThread.chapter3.t4.t4_2;

import java.util.Date;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/11/4 11:26
 */
public class InheritableThreadLocalExt extends InheritableThreadLocal {
    @Override
    protected Object initialValue() {
        return new Date().getTime();
    }

    @Override
    protected Object childValue(Object parentValue) {
        return  parentValue+"子线程";
    }
}
