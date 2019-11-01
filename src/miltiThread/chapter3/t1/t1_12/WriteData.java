package miltiThread.chapter3.t1.t1_12;

import javax.imageio.IIOException;
import java.io.IOException;
import java.io.PipedOutputStream;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/10/31 16:40
 */
public class WriteData {
    public void writeMethod(PipedOutputStream out){
        try{
            System.out.println("write : ");
            for (int i = 0; i <300 ; i++) {
                String outData = ""+(i+1);
                out.write(outData.getBytes());
                System.out.print(outData);
            }
            System.out.println("---------------------------------------------");
            out.close();
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
