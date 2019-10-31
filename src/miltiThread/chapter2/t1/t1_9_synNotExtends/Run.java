package miltiThread.chapter2.t1.t1_9_synNotExtends;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/10/24 20:15
 */
public class Run {
    public static void main(String[] args) {
        Sub subRef = new Sub();
        ThreadA threadA = new ThreadA(subRef);
        threadA.setName("a");
        threadA.start();
        ThreadB threadB = new ThreadB(subRef);
        threadB.setName("b");
        threadB.start();
    }
}
