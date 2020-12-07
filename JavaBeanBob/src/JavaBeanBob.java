
// this is is the the basic set-up of a "Java Bean"=> total encapsulation
// "the Bean" (uses getters  / setters)
//when moving data back and forth will most likely be thru a Bean Object

// an object class in Java is the Topmost class in Java 


public class JavaBeanBob {
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public String getA() {
		return a;
	}
	public void setA(String a) {
		this.a = a;
	}
	
	private int x;
	private int y;
	private String a;

}


