package miltiThread.chapter2.t3.t3_3;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/10/29 14:29
 */
public class PrintString implements Runnable{
    volatile  private boolean isContinuePrint =true;
    public boolean isContinuePrint( ){
        return isContinuePrint;
    }
    public void setIsContinuePrint(boolean isContinuePrint){
        this.isContinuePrint= isContinuePrint;
    }
    public void printStringMethod(){
        System.out.println("进入 run");
            while(isContinuePrint==true){

            }

        System.out.println("线程被停止了");
    }

    @Override
    public void run() {
        printStringMethod();
    }
}
