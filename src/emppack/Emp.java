package emppack;

import datepack.MyDate;

class Emp {
	
	private int eid; // instance var mem per object
	private String name;
	private MyDate doj; // Contentment
	static String company; // class var mem per class
	
	// static block
	static
	{
		company = "YASH";
		System.out.println("static block");
	}
	
	Emp() // Default Constructor
	{
		this.eid = 1;
		this.name = "Ram";
		this.doj = new MyDate();
		
		System.out.println("Emp()");
	}
	
	Emp(int i , String n , MyDate d) // para Constructor
	{
		eid = i;
		name = n;
		doj = d;
		System.out.println("Emp(-,-)");
	}
	
	
	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public MyDate getDoj() {
		return doj;
	}

	public void setDoj(MyDate doj) {
		this.doj = doj;
	}

	

	@Override
	public String toString() {
		return "Emp [eid=" + eid + ", name=" + name + ", doj=" + doj + "]";
	}

	void printEmp() // Member Function
	{
		System.out.println("Eid = "+eid+" Name = "+name);
	}
	
	static void printCompany()
	{
		System.out.println("Company : "+Emp.company); // static property
	}
	
	public static void main(String[] args) 
	{
		System.out.println("main()");
		Emp e1; // Referance
		e1= new Emp(); // Object
		e1.printEmp();
		Emp.printCompany(); // call static fun
		
//		System.out.println(e1);
		
		Emp e2 = new Emp(2,"Sham",new MyDate());
		//e2.printEmp();
		System.out.println( Emp.company );
//		e2.setEid(5);
	//	e2.setName("www");
		
//		System.out.println( e2.getName() );
//		System.out.println( e2.getEid() );
//		System.out.println( e2.getDoj() );
//		
//		System.out.println( e2.doj.year );
		//System.out.println( e1.getName() );
	}

}
