package miltiThread.chapter2.t2.t2_7;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/10/28 16:28
 */
public class Run {
    public static void main(String[] args) {
        try {
            MyOneList list = new MyOneList();
            ThreadA threadA = new ThreadA(list);
            threadA.setName("A");
            threadA.start();

            ThreadB threadB = new ThreadB(list);
            threadB.setName("B");
            threadB.start();
            Thread.sleep(6000);
            System.out.println("size:  "+list.getSize());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
