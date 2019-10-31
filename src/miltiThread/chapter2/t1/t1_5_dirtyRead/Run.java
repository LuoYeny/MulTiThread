package miltiThread.chapter2.t1.t1_5_dirtyRead;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/10/24 17:20
 */
public class Run {

    public static void main(String[] args) {
        try{
            PublicVar publicVar = new PublicVar();
            ThreadA threadA = new ThreadA(publicVar);
            threadA.start();
            Thread.sleep(200);
            publicVar.getValue();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
