package exception;
// try catch finally throw throws
public class Calci 
{
	void div(int a,int b)
	{
		System.out.println("Inside div");
		int res;
		try{
			System.out.println("Inside try");
			if(b ==0)
			{
				throw new ArithmeticException();
			}
			res = a / b;
			System.out.println("Div : "+res);
			int arr[] = new int[1];
			arr[2] = 10;
		}
		catch (ArithmeticException|ArrayIndexOutOfBoundsException e) {
			
			if(e instanceof ArithmeticException)
			{
			System.out.println("Inside Catch 1");
			System.out.println("Pl enter val > 0");
			}
			else if(e instanceof ArrayIndexOutOfBoundsException)
			{
			System.out.println("IndexOutOfBoundsException");
			}
			e.printStackTrace();
		}
//		catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("Inside Catch 2");
//			System.out.println("IndexOutOfBoundsException");
//		}
		finally
		{	
			System.out.println("Inside Finally");
			System.out.println("End Div");
		}
	}
	public static void main(String[] args) {
		Calci c = new Calci();
		c.div(20, 0);

	}

}
