package datepack;

public class MyDate {
	
	int day,month; // instance var
	public int year;
	
	
                // local
	MyDate(int day, int month, int year) {
		this();
		this.day = day;
		this.month = month;
		this.year = year;
		System.out.println("mydate(---)");
	}
	public MyDate() {
		//this(1,1,1);
		day = 1;
		this.month = 1;
		this.year = 1900;
		System.out.println("mydate()");
	}

	@Override
	public String toString() {
		return "MyDate [day=" + day + ", month=" + month + ", year=" + year + "]";
	}
	
	public static void main(String[] args) {
	//	MyDate d1 = new MyDate();
		MyDate d2 = new MyDate(9,10,2017);
	}
	

}
