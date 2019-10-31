package miltiThread.chapter2.t2.t2_14_sysInnerClass;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/10/29 11:06
 */
public class Run {
    public static void main(String[] args) {
        final OutClass.Inner inner =new OutClass.Inner();
        Thread t1 =new Thread( new Runnable(){
            public void run(){
              inner.method1();
            }
        },"A"){

        };
        Thread t2 =new Thread( new Runnable(){
            public void run(){
              inner.method2();
            }
        },"B"){

        };
        t1.start();
        t2.start();
    }
}
