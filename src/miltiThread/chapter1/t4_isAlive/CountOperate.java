package miltiThread.chapter1.t4_isAlive;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/10/23 10:49
 */
public class CountOperate extends Thread {


 public   CountOperate(){
     System.out.println("CountOperate--begin");
     System.out.println("test由 this.currentThread().getName()"+this.currentThread().getName() );
     System.out.println("this.currentThread().isAlive()"+this.currentThread().isAlive());
     System.out.println(" this .getName()"+this .getName() );
     System.out.println("this.isAlive()"+this.isAlive());
     System.out.println("CountOperate--end");
 }
    @Override
   synchronized public void run() {
        super.run();

        System.out.println("run--begin");
        System.out.println("test由 this.currentThread().getName()"+this.currentThread().getName() );
        System.out.println("this.currentThread().isAlive()"+this.currentThread().isAlive());
        System.out.println(" this .getName()"+this .getName() );
        System.out.println("this.isAlive()"+this.isAlive());
        System.out.println("run--end");
    }
}
