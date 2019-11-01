package miltiThread.chapter3.t1.t1_12;

import java.io.IOException;
import java.io.PipedInputStream;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/10/31 16:45
 */
public class ReadData {
    public void readMethod(PipedInputStream input){
        try{
            System.out.println("read :");
            byte [] byteArray = new byte[20];
            int readLength = input.read(byteArray);
            while (readLength!=-1){
                String newData = new String(byteArray,0,readLength);
                System.out.print(newData);
                readLength = input.read(byteArray);
            }
            System.out.println("-------------------------------------------------------");
            input.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

}
