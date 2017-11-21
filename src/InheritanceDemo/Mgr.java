package InheritanceDemo;

public class Mgr extends Emp
{
	int bonous;
	
	public Mgr() {
		super();
		bonous = 1500;
		System.out.println("Mgr()");
	}

	public Mgr(int eid, String name, float bsal, int bonous) 
	{
		super(eid, name, bsal);
		this.bonous = bonous;
		System.out.println("Mgr(----)");
	}
	
	// Overiding
		void calSal()
		{
			System.out.println("Mgr Sal : "+(bsal+bonous));
		}

	@Override
	public String toString() {
		return "Mgr [bonous=" + bonous + ", eid=" + eid + ", name=" + name + ", bsal=" + bsal + "]";
	}

}
