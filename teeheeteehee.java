
public class teeheeteehee {
	public static int rollDice() {
		return (int)( Math.random()*6) + (int) (Math.random()*6)+2;
	}
	public static void test() {

		int two=0;

		int three=0;

		int four=0;

		int five=0;

		int six=0;

		int seven=0;

		int eight=0;

		int nine=0;

		int ten=0;

		int eleven=0;

		int twelve=0;
		
		for(int i = 0; i<=1000000; i++) {
			if(rollDice()==2) {
				two++;
			}
			if(rollDice()==3) {
				three++;
			}
			if(rollDice()==4) {
				four++;
			}
			if(rollDice()==5) {
				five++;
			}
			if(rollDice()==6) {
				six++;
			}
			if(rollDice()==7) {
				seven++;
			}
			if(rollDice()==8) {
				eight++;
			}
			if(rollDice()==9) {
				nine++;
			}
			if(rollDice()==10) {
				ten++;
			}
			if(rollDice()==11) {
				eleven++;
			}
			if(rollDice()==12) {
				twelve++;
			}
		}
		System.out.println("Two: "+ 100*two/1000000);

		System.out.println("Three: " + 100*three/1000000);

		System.out.println("Four: " + 100*four/1000000);

		System.out.println("Five: "+100*five/1000000);

		System.out.println("Six: " +100*six/1000000);

		System.out.println("Seven: " +100*seven/1000000);

		System.out.println("Eight: "+100*eight/1000000);

		System.out.println("Nine: "+100*nine/1000000);

		System.out.println("Ten: " +100*ten/1000000);

		System.out.println("Eleven: "+100*eleven/1000000);


		System.out.println("Twelve: "+100*twelve/1000000);
	}
	public static void main(String[] args) {
		test();
	}
}
