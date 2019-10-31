package miltiThread.chapter2.t2.t2_7;



/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/10/28 10:27
 */
public class ThreadA extends Thread {
    private MyOneList list;
     public ThreadA(MyOneList list){
         super();
         this.list=list;
     }
     public void run(){
         MyService service =new MyService();
         service.addSwrvice(list,"A");
     }
}
