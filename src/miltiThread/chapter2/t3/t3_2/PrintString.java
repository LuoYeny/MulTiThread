package miltiThread.chapter2.t3.t3_2;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/10/29 14:29
 */
public class PrintString implements Runnable{
    private boolean isContinuePrint =true;
    public boolean isContinuePrint( ){
        return isContinuePrint;
    }
    public void setIsContinuePrint(boolean isContinuePrint){
        this.isContinuePrint= isContinuePrint;
    }
    public void printStringMethod(){
        try{
            while(isContinuePrint = true){
                System.out.println("run in printStringMethod threadname  =  "+Thread.currentThread().getName());
                Thread.sleep(1000);

            }

        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        printStringMethod();
    }
}
