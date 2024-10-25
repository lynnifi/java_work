
public class findcommonfactor {

	public static boolean CommonFactor(int f, int n, int m) {
		return((n%f==0)&&(m%f==0));
	}
	public static void main (String[] args) {
		System.out.println (CommonFactor(3,51,18));
	}
}
