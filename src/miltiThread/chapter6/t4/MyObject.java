package miltiThread.chapter6.t4;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/11/7 16:05
 */
public class MyObject implements Serializable {
    private static final long serialVersionUID = 8888L;
    //内部类方式
     private  static class MyObjectHandler{
        private static MyObject myObject = new MyObject();
    }

    private MyObject(){}
    public static MyObject getInstance(){
        return MyObjectHandler.myObject;
    }

    protected Object readResolve() throws ObjectStreamException{
        System.out.println(1);
         return  MyObjectHandler.myObject;
    }
}
