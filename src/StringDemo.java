
public class StringDemo 
{

	public static void main(String[] args) 
	{
		String s1 = "abc";
		System.out.println(s1);
	//	s1 = "eee"; // "abc" become garbage obj
	//	System.out.println(s1);
		String s2 = new String("www");
		// First class object, immutable
		
	//	StringBuffer  is ThreadSafe or synchronize
	//	StringBuilder is Non ThreadSafe or non synchronize
		
		StringBuffer sb = new StringBuffer(s1);
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
	}

}
