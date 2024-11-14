import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("Please return an integer:");
		boolean yippee = false;
		while(!yippee){
			try {
				int x = kb.nextInt();
				System.out.println("Your integer is: " +x);
			} catch (InputMismatchException AAA) {
				kb.nextLine();
				System.out.println("Problem ... please enter an integer->");
			}
		}
		
		System.out.println("Please tell me your name?");
		String y = kb.nextLine();
		System.out.println("Nice to meet you" + y);
	}
}
