package miltiThread.chapter6.t5;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/11/7 16:05
 */
public class MyObject {
    //static方式

        private static MyObject myObject = null;


    private MyObject(){}
    static {
        myObject=new MyObject();
    }
    public static MyObject getInstance(){
        return myObject;
    }
}
