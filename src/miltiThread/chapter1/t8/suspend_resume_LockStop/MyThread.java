package miltiThread.chapter1.t8.suspend_resume_LockStop;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/10/24 15:18
 */
public class MyThread extends  Thread {
    private long i = 1;
    @Override
    public void run(){
        while(true){
            i++;
            System.out.println(i);
        }
    }
}
