
public class findingzeros {
	public static void main(String[] args) {
		int num = 5;
		int i = num-1;
		int lol = 0;
		while(i>0) {
			int hehe = num*i;
			i--;
			if(hehe%10==0) {
				lol++;
				hehe=hehe/10;
				
			}
		}
		System.out.print(lol);
	}
}
