package miltiThread.chapter4.t1.t1_5;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/11/5 14:59
 */
public class Run {
    public static void main(String[] args) {
        try{
            MyService service = new MyService();
            ThreadA a = new ThreadA(service);
            a.setName("a");
            a.start();
            ThreadB b = new ThreadB(service);
            b.setName("b");
            b.start();
            Thread.sleep(3000);
            service.signal();
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}
