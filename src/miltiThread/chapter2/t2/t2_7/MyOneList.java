package miltiThread.chapter2.t2.t2_7;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/10/28 11:22
 */
public class MyOneList {
    private List list =new ArrayList();
    synchronized public void add(String data){
        list.add(data);
    };
    synchronized public int getSize(){
        return list.size();
    };
}

