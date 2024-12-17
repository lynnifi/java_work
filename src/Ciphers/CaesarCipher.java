package Ciphers;

public class CaesarCipher {
	private int shiftAmt;
	
	public CaesarCipher() {
		shiftAmt = (int) (Math.random()*25)+1;
	}
	public CaesarCipher(int s) {
		shiftAmt = s;
	}
	
	public String encode(String in) {
	    String upper = in.toUpperCase();

	    String answer = "";
	    for (int i = 0; i < in.length(); i++) {
	      if (Character.isLetter(upper.charAt(i))) {
	        char ch = (char) (upper.charAt(i) + shiftAmt);
	        if (ch > 'Z') {
	          ch = (char) (ch - 26);
	        }
	        if (Character.isLowerCase(in.charAt(i))) {
	          ch = Character.toLowerCase(ch);
	        }
	        answer += ch;
	      } else {
	        answer += upper.charAt(i);
	      }
	    }
	    return answer;
	  }

	  public String decode(String in) {
	    shiftAmt = 26 - shiftAmt;
	    String answer = encode(in);
	    shiftAmt = 26 - shiftAmt;
	    return answer;
	  }
}
