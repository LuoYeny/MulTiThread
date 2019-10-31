package miltiThread.chapter2.t1.t1_1;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/10/24 16:32
 */
public class Run {
    public static void main(String[] args) {
        HasSelfPrivateNum num = new HasSelfPrivateNum();
        ThreadA threadA =new ThreadA(num);
        threadA.start();
        ThreadB threadB =new ThreadB(num);
        threadB.start();
    }
}
