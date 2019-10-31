package miltiThread.chapter2.t2.t2_15_sysInnerClass;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/10/29 11:25
 */
public class Run {
    public static void main(String[] args) {
        final OutClass.InnerClass1 in1 =new OutClass.InnerClass1();
        final OutClass.InnerClass2 in2 =new OutClass.InnerClass2();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                in1.method1(in2);
            }
        },"t1");
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                in1.method2();
            }
        },"t2");
        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                in2.method1();
            }
        },"t3");
        t1.start();
        t2.start();
        t3.start();

    }
}
