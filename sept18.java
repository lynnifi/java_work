import java.util.Date;

public class sept18 {
	public static void main(String[] args) {
		Date d1 = new Date();
		Date d2 = new Date();
		System.out.println("1 Before: " + d1);
		System.out.println("2 Before: " + d2);
		altery(d2);
		alterm(d1);
		System.out.println("1 After: " + d1);
		System.out.println("2 After: " + d2);
	}
	
	public static void alterm(Date x) {
		x.setMonth(x.getMonth()+1);
	}
	public static void altery(Date x) {
		x.setYear(x.getYear()+1);
	}
}
