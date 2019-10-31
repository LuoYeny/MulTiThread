package miltiThread.chapter3.t1.t1_1;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/10/30 9:50
 */
public class ThreadB extends  Thread {
    private MyList list;

    public ThreadB(MyList list) {
        super();
        this.list = list;
    }
    public void run(){
        try{

            while(true){
               System.out.println("11111111");

                if(list.size()==5){
                    System.out.println("==5了，线程b要退出了");
                    throw new InterruptedException();
                }
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
