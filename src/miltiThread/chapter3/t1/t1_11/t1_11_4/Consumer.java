package miltiThread.chapter3.t1.t1_11.t1_11_4;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/10/31 16:04
 */
public class Consumer {
    private MyStack myStack;

    public Consumer(MyStack myStack) {
        super();
        this.myStack = myStack;
    }
    public void pushService(){
        System.out.println("pop= "+myStack.pop());

    }
}
