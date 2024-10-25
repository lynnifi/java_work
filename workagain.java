/**
 * 
 * @author Cailyn Farrell
 *
 */
public class workagain {
	
	public static int sumOfSquares(int i) {
		int k =0;
		for(int j = i; j>=0;j--) {
			k+=j*j;
		}
		return(k);
	}

	public static boolean cf(int f, int n, int m) {
		/**
		 * @param f being a factor, n and m being the integers that f should be checked as a factor of. 
		 * @return returns if f is a factor of n and m.
		 */
		return(n%f==0&&m%f==0);
	}
	public static int gcf(int n, int m) {
		if (m>n) {
				int j = 0;
				j=m;
				m=n;
				n=j;
		}
		for(int p = n; p<=n;p--) {
			if(cf(p,n,m)==true) {
				return(p);
			}
		}
		return(1);
	}
	public static void main(String[] args) {
		System.out.println(gcf(6,1));
	}
}
