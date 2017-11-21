package innerClasses;
// Outer Class
public  class Bank 
{
	int branch;
	// Inner Class
	static class Locker
	{
		static int lid;
		public Locker() {
		lid = 123;
		}
		static void printLocker()
		{
			System.out.println("Locker ID : "+lid);
		}
	}
	
	void myFun()
	{ 
		System.out.println("Inside myFun()");
		// Local or method Inner class 
		 class Locker2
		{
			 int lid;
			public Locker2() {
			lid = 123;
			}
			 void printLocker2()
			{
				System.out.println("Locker2 ID : "+lid);
			}
		}
		 Locker2 l2 = new Locker2();
		 l2.printLocker2();
	}

	public static void main(String[] args) 
	{
		
		Bank b = new Bank();
	//	Locker l = b.new Locker(); // for non static
	//	Bank.Locker l =new Bank.Locker(); //for static
	//	Locker.printLocker();
		
		b.myFun(); // for Local inner class

	}

}
