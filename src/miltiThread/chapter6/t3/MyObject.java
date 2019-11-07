package miltiThread.chapter6.t3;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/11/7 16:05
 */
public class MyObject {
    //内部类方式
     private  static class MyObjectHandler{
        private static MyObject myObject = new MyObject();
    }

    private MyObject(){}
    public static MyObject getInstance(){
        return MyObjectHandler.myObject;
    }
}
