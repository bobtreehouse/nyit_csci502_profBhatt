
public class SubstitutionCipher implements MessageEncoder {
	int shift;
	public SubstitutionCipher(int shift) {
		this.shift = (3);
	}
	
	@Override
	public String encode(String plainText) {
		 
		return null;
	}
	

	char shifter(char letter) {
		return (char)(letter+this.shift);
	}
}