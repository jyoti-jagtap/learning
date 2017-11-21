package IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectSerialization 
{

	public static void main(String[] args) {
		MyDate d = new MyDate(25,10,2017);
		try 
		{
			FileOutputStream fos = new FileOutputStream("./src/object.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(d);
			System.out.println("Write success");
			
			FileInputStream fis = new FileInputStream("./src/object.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			MyDate d2 = (MyDate) ois.readObject();
			System.out.println(d2);
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
