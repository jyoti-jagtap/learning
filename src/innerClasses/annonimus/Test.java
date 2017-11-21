package innerClasses.annonimus;

public class Test {

	static void callPrint(Parent obj)
	{
		obj.print();
	}
	public static void main(String[] args) {
		
		callPrint(new Parent());
		callPrint(new Chield());
		callPrint(new Parent()
					{
						void print()
						{
					    	System.out.println("Annonimus()");
						}
					}
				);

	}

}
