package miltiThread.chapter5.t1.t1_2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/11/7 15:07
 */
public class Run2 {
    static public class MyTaskA extends TimerTask{
        public void run(){
            System.out.println("A运行了 ：时间为"+new Date());
            this.cancel();

        }
    }
    static public class MyTaskB extends TimerTask{
        public void run(){
            System.out.println("B运行了 ：时间为"+new Date());

        }
    }

    public static void main(String[] args) {
        try {
            MyTaskA taskA =new MyTaskA();
            MyTaskB taskB = new MyTaskB();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Timer timer = new Timer();
            String dataString= "2019-11-7 15:25:33";
            Date dateRef = sdf.parse(dataString);
            System.out.println("字符串时间 ： "+dateRef.toLocaleString()+"当前时间 ： "+new Date().toLocaleString());
            timer.schedule(taskA,dateRef,4000);
            timer.schedule(taskB,dateRef,4000);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
