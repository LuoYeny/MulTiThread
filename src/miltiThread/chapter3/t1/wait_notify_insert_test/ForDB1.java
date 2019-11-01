package miltiThread.chapter3.t1.wait_notify_insert_test;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/10/31 18:59
 */
public class ForDB1 {
    public MyDB myDB;

    public ForDB1(MyDB myDB) {
        this.myDB = myDB;
    }
    public void db1Method(){
        myDB.db1();
    }
}
