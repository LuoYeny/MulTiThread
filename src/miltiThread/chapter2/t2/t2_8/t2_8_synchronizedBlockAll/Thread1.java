package miltiThread.chapter2.t2.t2_8.t2_8_synchronizedBlockAll;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/10/28 16:50
 */
public class Thread1 extends Thread {

    private Service service;
    private MyObject myObject;

    public Thread1(Service service, MyObject myObject) {
        super();
        this.service = service;
        this.myObject = myObject;
    }
    public void run(){
        super.run();
        service.testMethod1(myObject);
    }
}
