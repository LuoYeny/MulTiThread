package miltiThread.chapter2.t2.t2_15_sysInnerClass;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/10/29 11:16
 */
public class OutClass {
    static class InnerClass1{
        public void method1(InnerClass2 class2) {
            String threaName = Thread.currentThread().getName();
            synchronized (class2) {
                System.out.println(threaName + "进入innerClass1类中的method1方法");
                for (int i = 0; i < 10; i++) {
                    System.out.println("i= " + i);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
                System.out.println(threaName + "离开innerClass1类中的method1方法");
            }
        }
        public synchronized void method2( ){
            String threaName = Thread.currentThread().getName();
            System.out.println(threaName+"进入innerClass1类中的method2方法");
            for (int i = 0; i <10 ; i++) {
                System.out.println("j= "+i);
                try{Thread.sleep(100);}catch (InterruptedException e){
                    e.printStackTrace();
                }

            }
            System.out.println(threaName+"离开innerClass1类中的method2方法");
        }

    }
    static class InnerClass2{
        public synchronized void method1( ){
            String threaName = Thread.currentThread().getName();
            System.out.println(threaName+"进入innerClass2类中的method1方法");
            for (int i = 0; i <10 ; i++) {
                System.out.println("k= "+i);
                try{Thread.sleep(100);}catch (InterruptedException e){
                    e.printStackTrace();
                }

            }
            System.out.println(threaName+"离开innerClass2类中的method1方法");
        }
    }
}
