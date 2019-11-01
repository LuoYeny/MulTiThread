package miltiThread.chapter3.t1.t1_12;

import java.io.PipedInputStream;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/10/31 17:23
 */
public class ThreadRead extends Thread {
    private ReadData read;
    private PipedInputStream input;

    public ThreadRead(ReadData read, PipedInputStream input) {
        super();
        this.read = read;
        this.input = input;
    }
    public void run(){
        read.readMethod(input);
    }
}
