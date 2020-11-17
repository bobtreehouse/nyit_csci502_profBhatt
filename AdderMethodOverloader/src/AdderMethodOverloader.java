
public class AdderMethodOverloader {

	 
		static int add(int a, int b){return a+b;}
		static int add(int a, int b, int c) {return a+b+c;} 
		
	public static void main() {
		System.out.println(AdderMethodOverloader.add(11,11));
		System.out.println(AdderMethodOverloader.add(11,11,11));
	}
}
