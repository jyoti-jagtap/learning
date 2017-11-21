package IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileIO 
{
	//InputStream  // to read
	//OutputStream // to write

	public static void main(String[] args) {
		try 
		{
			FileInputStream fis = new FileInputStream("./src/input.txt");
			FileOutputStream fos = new FileOutputStream("./src/output.txt");
			
			int ch;
			while((ch = fis.read()) != -1)
			{
				System.out.print((char)ch);
				fos.write(ch);
			}
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
