package miltiThread.chapter2.t2.t2_1;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/10/28 9:29
 */
public class MyThread extends Thread {
    private Task task ;
    public MyThread(Task task){
        super();
        this.task=task;

    }
    public void run(){
        super.run();
        CommonUtill.beginTime1=System.currentTimeMillis();
        task.doLongTimeTask();
        CommonUtill.endtime1=System.currentTimeMillis();
    }
}
