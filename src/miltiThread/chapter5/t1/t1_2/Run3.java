package miltiThread.chapter5.t1.t1_2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/11/7 14:58
 */
public class Run3 {
    static int i =0;
    static public class MyTask extends TimerTask{
        public void run(){
            System.out.println("运行了  ："+i);
        }
    }

    public static void main(String[] args) {
        while (true) {
            try{
                i++;
                MyTask myTask = new MyTask();
                SimpleDateFormat sdf =new SimpleDateFormat("yyyy-mm-dd HH:mm:ss");
                String dateString = "2019-11-7 15:32:33";
                Date dateRef = sdf.parse(dateString);
       //         System.out.println("字符串时间 ： "+dateRef.toLocaleString()+"当前时间 ： "+new Date().toLocaleString());
                Timer timer = new Timer();
                timer.schedule(myTask,dateRef);
                timer.cancel();

            }catch (ParseException e){
                e.printStackTrace();
            }
        }
    }

}
