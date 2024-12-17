package Ciphers;

public class VigenereCipher extends CaesarCipher{
	
	private String key;
	
	public VigenereCipher(String k) {
		super();
		key = k;
		
	}
	
	public VigenereCipher() {
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		while (alphabet.length() > (int) (Math.random()*25+1)) {
            int index = (int) (Math.random() * alphabet.length());
            key += alphabet.charAt(index); 
        }
	}
	
	public String encode(String in) {
		String newMessage="";
		while(key.length()<in.length()) {
			key+=key;
		}

	    for (int i = 0; i < in.length(); i++)
	    {
	        
	    }
	    return newMessage;
	}
	public String decode(String in) {
		return in;
		
	}
	
	
}


