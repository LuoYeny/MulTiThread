package miltiThread.chapter3.t1.t1_11.t1_11_5;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/10/31 16:02
 */
public class Producer {
    private MyStack myStack;

    public Producer(MyStack myStack) {
        super();
        this.myStack = myStack;
    }
    public void pushService(){
        myStack.push();
    }
}
