import java.util.Scanner;
public class novembersixteenth {
	public static void main (String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("Please tell me your name: ");
		String y = kb.nextLine();
			if(y.equals("cailyn")) {
				System.out.println("Congratulations, my name is " + y);
			}
			else System.out.println("That's not my name, try again!");
	}
}
