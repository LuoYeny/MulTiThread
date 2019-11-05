package miltiThread.chapter4.t1.t1_8;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/11/5 15:27
 */
public class Run {
    public static void main(String[] args) {
        MyService service = new MyService();
        ThreadA[] a  =new ThreadA[10];
        ThreadB[] b =new ThreadB[10];
        for (int i = 0; i <10 ; i++) {
            a[i]=new ThreadA(service);
            b[i]=new ThreadB(service);
            a[i].start();
            b[i].start();
        }

    }
}
