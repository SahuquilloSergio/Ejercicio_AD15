package ad15;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class AD15 {

    public static void main(String[] args) {
    
        mclase mc = new mclase("ola",-7,2.7E10);
        mclase obj1 = new mclase();
        try{
        ObjectOutputStream ous = new ObjectOutputStream(new FileOutputStream("serial"));
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("serial"));
        ous.writeObject(mc);
        ous.close();
        
        obj1=(mclase)ois.readObject();
        
        System.out.println("s="+obj1.getNome()+" i="+obj1.getNum1()+" d="+obj1.getNum2());
        ois.close();
        }catch (IOException ex){
            System.out.println("Error: "+ex);
        }catch (ClassNotFoundException ex){
            System.out.println("Error: "+ex);
        }
    }
    
}
