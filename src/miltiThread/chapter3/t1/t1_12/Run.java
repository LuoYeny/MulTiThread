package miltiThread.chapter3.t1.t1_12;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/10/31 17:25
 */
public class Run {
    public static void main(String[] args) {
        try{
            WriteData writeData =new WriteData();
            ReadData readData = new ReadData();
            PipedInputStream inputStream = new PipedInputStream();
            PipedOutputStream outputStream = new PipedOutputStream();
            outputStream.connect(inputStream);
            ThreadRead threadRead = new ThreadRead(readData,inputStream);
            threadRead.start();
            Thread.sleep(1000);

            ThreadWrite threadWrite = new ThreadWrite(writeData,outputStream);
            threadWrite.start();

        }catch (IOException e){
            e.printStackTrace();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
