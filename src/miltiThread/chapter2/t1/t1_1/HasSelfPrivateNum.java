package miltiThread.chapter2.t1.t1_1;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/10/24 16:25
 */
public class HasSelfPrivateNum {
    public void addI(String username){
        try{
            int num = 0;
            if(username.equals("a")){
                num= 100;
                System.out.println("a set over");
                Thread.sleep(2000);
            }else {
                num = 200;
                System.out.println("b set over");
            }
            System.out.println(username+ "num= "+num);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
