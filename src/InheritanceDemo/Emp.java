package InheritanceDemo;

public abstract class Emp 
{
	int eid;
	String name;
	float bsal;	

	public Emp() 
	{
		eid = 1;
		name = "Ram";
		bsal = 10000;
		System.out.println("Emp()");
	}

	public Emp(int eid, String name, float bsal) {
		
		this.eid = eid;
		this.name = name;
		this.bsal = bsal;
		System.out.println("Emp(---)");
	}

	@Override
	public String toString() {
		return "Emp [eid=" + eid + ", name=" + name + ", bsal=" + bsal + "]";
	}
	
	abstract void calSal();
	

}
