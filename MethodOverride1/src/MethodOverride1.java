
public class MethodOverride1 {


		void show() {
			System.out.println("Parent's show() method providied from base or parent class.");
		}
		
	}
	
	//inherited Class
	class Child extends MethodOverride1 {
		//this method Overrides the show() of Parent
		@Override
		void show() {
			System.out.println("Child's show() method from the inherited class.");
		}
	
	
	//Driver Class
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//if a Parent type reference refers to a parents object then Parent's show is called
		MethodOverride1 obj1 = new MethodOverride1();
		obj1.show();
		
		MethodOverride1 obj2 = new Child();
		obj2.show();
		
	}
	

}
