import java.util.Date;

public class sep17 {
	public static void main(String[] args) {
		int x = 10;
		String str = "SMCS";
		Date d = new Date();
		alterContents(x,str,d);
		System.out.println("x= "+x);
		System.out.println("str =" +str); 
		System.out.println("d= "+d);
	}
	public static void alterContents(int num, String word, Date date) {
		num ++;
		word = word + "gooba!";
		date.setMonth(10);
	}
	
}
	