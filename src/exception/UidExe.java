package exception;

public class UidExe extends RuntimeException
{
	public UidExe() {
		System.out.println("Pl enter valid UID");
	}
	public UidExe(String msg) {
		System.out.println(msg);
	}
}
