
public class RemoveDuplicates {
/*	
	public char[] removeDuplicates(char[] in, String input) {
		String noDupes = "";
		for(int i=0; i<in.length; i++) {
			if(!noDupes.contains(String.valueOf(input.charAt(i)))) {
				noDupes += String.valueOf(input.charAt(i));
	        }
			return noDupes;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[] in = {'b','d','a','b','f','a','g','a','a','f'};
		System.out.println(removeDuplicates(in));
		

	}
*/
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//char[] in = {'b','d','a','b','f','a','g','a','a','f'};
		//System.out.println(removeDuplicates(in));
	
	
	//public char[] removeDuplicates(char[] in) {
		String in = "bdabfagaaf";
		String out= "";
		for(int i = 0; i < in.length(); i++) {
			Boolean found = false;
			for(int j = 0; j < out.length(); j++) {
				if(in.charAt(i) == out.charAt(j)) {
					found = true;
					break;
				}
			}
			if(found == false) {
				out = out.concat(String.valueOf(in.charAt(i)));
			}
		}
		System.out.println(out);

	}
	
}
