
public class WrapperDemo 
{

	public static void main(String[] args) {
		//Primative 	WrapperClass
		// int 			Integer
		// float 		Float
		// double		Double
		
		// primative to wrapper obj
		int num = 100;
		Integer inum;
		//inum = new Integer(num);
		inum = num;
		System.out.println(inum);
		
		// obj to primative
		
		int val;
	//	val = inum.intValue();
		val = inum;
		System.out.println(val);
		
	//	String to primative
		String s = "123";
		
		int x = Integer.parseInt(s);
		System.out.println( x );
		
	}

}
