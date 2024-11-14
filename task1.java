import java.util.InputMismatchException;
import java.util.Scanner;

public class task1 {
	public static void e () {
		Scanner kb = new Scanner(System.in);
		System.out.println("Please return an integer for your lower bound:");
		boolean yippee = false;
		while(!yippee){
			try {
				int x = kb.nextInt();
				System.out.println("Please return an integer for your upper bound:");
				int y = kb.nextInt();
				int a = (int) (Math.random()*(y-x)) + (x);
				System.out.println(a);
			} catch (InputMismatchException AAA) {
				kb.nextLine();
				System.out.println("Problem ... please start over and enter an integer for your lower bound->");
			}
		}
	}
	public static void main (String[] args) {
		e();
		Scanner rr = new Scanner(System.in);
		System.out.println("Please return an integer for your target:");
		boolean aaa = false;
		while(!aaa){
			try {
				int z = rr.nextInt();
			} catch (InputMismatchException BBB) {
				rr.nextLine();
				System.out.println("Problem ... please enter n integer for your target->");
			}
		}
	}
}
