package miltiThread.chapter4.t1.t1_9Fair_notFait_test;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/11/5 15:58
 */
public class Run {
    public static void main(String[] args) {
        try {
            final MyService service = new MyService(false);
            Runnable runnable = new Runnable() {
                @Override
                public void run() {
                    System.out.println("线程 "+Thread.currentThread().getName()+" 运行了 ");
                    service.serviceMethod();
                }
            };
            Thread[] threads = new Thread[10];
            for (int i = 0; i <10 ; i++) {
                threads[i] =new Thread(runnable);

            }
            for (int i = 0; i <10 ; i++) {
                    threads[i].start();

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
