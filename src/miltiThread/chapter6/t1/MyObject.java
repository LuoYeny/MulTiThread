package miltiThread.chapter6.t1;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/11/7 16:05
 */
public class MyObject {
    //饿汉模式
    //使用类的时候已经将对象创建完毕
    private static  MyObject myObject = new MyObject();
    private MyObject(){}
    public static MyObject getInstance(){
        return myObject;
    }
}
