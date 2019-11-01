package miltiThread.chapter3.t1.t1_12;

import java.io.PipedOutputStream;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/10/31 16:55
 */
public class ThreadWrite extends  Thread {
    private WriteData write;
    private PipedOutputStream out;

    public ThreadWrite(WriteData write, PipedOutputStream out) {
        super();
        this.write = write;
        this.out = out;
    }
    public void run(){
        write.writeMethod(out);
    }
}
