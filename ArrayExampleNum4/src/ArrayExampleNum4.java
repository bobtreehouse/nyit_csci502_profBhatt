
public class ArrayExampleNum4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numbers = new int[4];
		int[] numbers2 = {1,2,3,4};
		//System.out.println(numbers.length);
		//System.out.println(numbers2[0]);
		numbers[0] = 21;
		numbers[1] = 45;
		numbers[2] = 6;
		numbers[3] = 7;
		
		int[] list = new int[101];
		for(int i = 0;i<list.length;i++){
		 
			list[i]=i;
			System.out.println(i);
		}
	}

}
