package miltiThread.chapter3.t1.t1_1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/10/30 9:45
 */
public class MyList {
    private List list = new ArrayList();
    public void add(){
        list.add("aaa");

    }
    public int size(){
        return list.size();
    }
}
