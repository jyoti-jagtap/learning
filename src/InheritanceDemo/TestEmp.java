package InheritanceDemo;

public class TestEmp {

	public static void main(String[] args) 
	{
		
		Emp m1 = new Mgr();
		System.out.println( m1 );

		Emp m2 = new Mgr(2,"Sham", 23000, 2000);
		System.out.println( m2 );
		m2.calSal();
		
		

	}

}
