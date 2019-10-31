package miltiThread.chapter1.t8.suspend_resume_nosameValue;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/10/24 15:33
 */
public class MyObject {

    private String name ="1";
    private String password ="11";

    public void setValue(String name ,String password){
        this.name = name;
        if(Thread.currentThread().getName().equals("a")){
            System.out.println("停止a线程");
            Thread.currentThread().suspend();
        }
        this.password = password;
    }
    public void print(){
        System.out.println(name+":  "+password);
    }
}
