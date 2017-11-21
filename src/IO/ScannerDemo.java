package IO;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		//System.in.read();
		//System.out.print("");
Scanner sc = new Scanner(System.in);
System.out.println("Enter ID : ");
if(sc.hasNextInt())
{
 System.out.println("ID = "+sc.nextInt());	
}
else
{
	System.out.println("Invalid ID");
}
		
	}

}
