package miltiThread.chapter2.t2.t2_7;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/10/28 11:25
 */
public class MyService {
    public MyOneList addSwrvice(MyOneList myOneList ,String data){
        try{
            System.out.println("currentThread: "+Thread.currentThread().getName());
            synchronized (myOneList){
                System.out.println("myOneList.getSize(): "+myOneList.getSize());
                if(myOneList.getSize()<1){
                    Thread.sleep(2000);
                    myOneList.add(data);
                }
            }

        }catch(InterruptedException e){


            e.printStackTrace();
        }
        return myOneList;
    }

}
