import InheritanceDemo.Emp;
import InheritanceDemo.Mgr;

public class ArrayDemo {

	public static void main(String[] args) {
	
		int arri[] = {1,2,3}; // Array object without new keyword
		
		int arr[] = new int[2]; // Array object using new keyword
		arr[0] = 10;
		arr[1] = 20;
		
		Mgr e = new Mgr();
		Mgr arrm[] = {new Mgr(),e};// Array object without new keyword
		
		Mgr arrm2[] = new Mgr[2]; // Array of referance
		arrm2[0] = new Mgr();
		arrm2[1] = e;

	}

}
