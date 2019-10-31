package miltiThread.chapter2.t2.t2_6;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/10/28 10:55
 */
public class Service {
    private String username;
    private  String password;
    private String anyString = new String();
    public void setUsernamePassword(String username,String password){
        try{
            synchronized (anyString){
                System.out.println(Thread.currentThread().getName()+":  在"+System.currentTimeMillis()
                +"进入同步块");
                username =username;
                Thread.sleep(2000);
                password =password;
                System.out.println(Thread.currentThread().getName()+":  在"+System.currentTimeMillis()
                        +"离开步块");
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

}
