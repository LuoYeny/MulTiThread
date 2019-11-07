package miltiThread.chapter6.t2.t2_1;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/11/7 16:05
 */
public class MyObject {
    //懒汉模式
    //调用方法时才创建实例
    private static MyObject myObject ;
    private MyObject(){}
    public static MyObject getInstance(){
        //延迟加载
        try {
            if(myObject!=null){

            }else {
                Thread.sleep(3000);
                myObject =new MyObject();
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return myObject;
    }
}
