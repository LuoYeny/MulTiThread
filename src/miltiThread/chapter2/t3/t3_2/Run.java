package miltiThread.chapter2.t3.t3_2;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/10/29 14:36
 */
public class Run {
    public static void main(String[] args) {
        PrintString printString = new PrintString();
      new Thread(printString).start();
        System.out.println("stop it :"+Thread.currentThread().getName());
        printString.setIsContinuePrint(false);
    }
}
