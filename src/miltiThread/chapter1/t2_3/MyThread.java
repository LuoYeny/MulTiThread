package miltiThread.chapter1.t2_3;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/10/23 10:49
 */
public class MyThread extends Thread {
    private int count = 5;
//    public MyThread(String name){
//        super();
//        this.setName(name);
//    }
//    public MyThread(){
//
//    }


//    public void run1() {
//        super.run();
//        while(count>0){
//            count--;
//            System.out.println("由"+this.currentThread().getName()+"计算 count = "+count);
//        }
//    }

    @Override
   synchronized public void run() {
        super.run();
        count--;
        System.out.println("run由 "+this.currentThread().getName()+"计算 count = "+count);

    }
}
