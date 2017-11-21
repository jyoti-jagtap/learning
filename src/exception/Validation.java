package exception;

public class Validation {

	static void checkUID(String user) throws UidExe
	{
		if(user.equalsIgnoreCase("yash"))
		{
			System.out.println("Welcome");
		}
		else
		{
			try {
				throw new UidExe();
			} catch (UidExe e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		checkUID("yash1");

	}

}
