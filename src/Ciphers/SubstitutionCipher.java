package Ciphers;

public class SubstitutionCipher{
	
	private String key;
	
	public SubstitutionCipher(String k) {
		key = k.toUpperCase();
	}
	
	public SubstitutionCipher() {
		key = "";
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        while (alphabet.length() > 0) {
            int index = (int) (Math.random() * alphabet.length());
            key += alphabet.charAt(index);
            alphabet = alphabet.substring(0, index) + alphabet.substring(index + 1); 
        }
	}
	
	private String eod(String in, int code){
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String newMessage = "";
        String message = in.toUpperCase();
        String a= (code==1) ? alphabet : key;
        String b= (code==1) ? key : alphabet;

        for (int i = 0; i < message.length(); i++) {
            char currentChar = message.charAt(i);
            int index = b.indexOf(currentChar);
            if (Character.isLowerCase(in.charAt(i))) {
            	newMessage += ((index != -1) ? Character.toLowerCase(a.charAt(index)) : Character.toLowerCase(currentChar));
            }else {
            	newMessage += ((index != -1) ? a.charAt(index) : currentChar);
        
            }
        }

        return newMessage;
	}
	
	public String encode(String in) {
	   return eod(in,0);
	    
	  }
	
	public String decode(String in) {
		return eod(in,1);
	}
	
}
