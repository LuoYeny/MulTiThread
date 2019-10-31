package miltiThread.chapter2.t2.t2_13_innerClass.innerClass;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/10/29 10:38
 */
public class Run {
    public static void main(String[] args) {
        PublicClass publicClass =new PublicClass();
        publicClass.setUsername("user1");
        publicClass.setPassword("password1");
        System.out.println(publicClass.getUsername()+" : " +publicClass.getPassword());
        PublicClass.PrivateClass privateClass = publicClass.new PrivateClass();
        privateClass.setAddress("address1");
        privateClass.setAge("age1");
        System.out.println(privateClass.getAddress()+" : "+privateClass.getAge());
    }
}
