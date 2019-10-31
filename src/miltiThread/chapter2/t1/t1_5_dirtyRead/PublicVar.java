package miltiThread.chapter2.t1.t1_5_dirtyRead;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/10/24 15:33
 */
public class PublicVar {

    private String name ="A";
    private String password ="AA";

    synchronized public void setValue(String name ,String password){
         try {
             this.name=name;
             Thread.sleep(5000);
             this.password=password;
             System.out.println("setValue method thread name="
             +Thread.currentThread().getName()
             +" username="
             +name+" password="+password);
         }catch (InterruptedException e){
             e.printStackTrace();
         }
    }

    public void getValue(){
        System.out.println("getValue method thread name="
                +Thread.currentThread().getName()
                +" username="
                +name+" password="+password);
    }

}
