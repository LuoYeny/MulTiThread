package miltiThread.chapter2.t2.t2_1;



/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/10/28 9:33
 */
public class Run {
    public static void main(String[] args) {
        Task task =new Task();
        MyThread thread1 =new MyThread(task);
        thread1.start();
        MyThread thread2= new MyThread(task);
        thread2.start();
        try{
            Thread.sleep(10000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("CommonUtill.beginTime:  "+CommonUtill.beginTime);
        System.out.println("CommonUtill.beginTime1:  "+CommonUtill.beginTime1);
        System.out.println("CommonUtill.endTime :"+CommonUtill.endTime);
        System.out.println("CommonUtill.endTime1 :"+CommonUtill.endtime1);
            long beginTime = CommonUtill.beginTime1;
        if(CommonUtill.beginTime1<CommonUtill.beginTime){
            beginTime =CommonUtill.beginTime;

        }
        long endTime =CommonUtill.endtime1;
        if(CommonUtill.endtime1<CommonUtill.endTime){
            endTime =CommonUtill.endTime;
        }
        System.out.println("耗时"+(endTime-beginTime)/1000);
    }
}
