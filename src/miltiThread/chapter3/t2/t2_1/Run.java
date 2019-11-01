package miltiThread.chapter3.t2.t2_1;



/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/11/1 11:02
 */
public class Run {
    public static void main(String[] args) {
        Mythread mythread =new Mythread();
        mythread.start();
        System.out.println("main 执行完毕");
    }
}
