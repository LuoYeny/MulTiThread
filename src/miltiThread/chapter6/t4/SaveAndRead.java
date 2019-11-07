package miltiThread.chapter6.t4;

import java.io.*;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/11/7 16:44
 */
public class SaveAndRead {
    public static void main(String[] args) {
        try {
            MyObject myObject = MyObject.getInstance();
            FileOutputStream fos = new FileOutputStream(new File("myObjFile.txt"));
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            oos.writeObject(myObject);
            oos.close();
            fos.close();
            System.out.println(myObject.hashCode());
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            FileInputStream fis =new FileInputStream(new File("myObjFile.txt"));
            ObjectInputStream ois = new ObjectInputStream(fis);
            MyObject myObject = (MyObject)ois.readObject();
            fis.close();
            ois.close();
            System.out.println(myObject.hashCode());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
