package miltiThread.chapter2.t2.t2_14_sysInnerClass;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/10/29 10:55
 */
public class OutClass {
    static class Inner{
        public void method1(){
            synchronized ("其他的锁"){
                for (int i = 1; i <=10 ; i++) {
                    System.out.println(Thread.currentThread().getName()+" i= "+i);
                    try{
                        Thread.sleep(1000);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }
        }
        public synchronized  void method2(){
            for (int i = 11; i <=20 ; i++) {
                System.out.println(Thread.currentThread().getName()+" i= "+i);
                try{
                    Thread.sleep(1000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        }

    }
}
