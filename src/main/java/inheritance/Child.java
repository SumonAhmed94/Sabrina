package inheritance;

public class Child extends Parent { //child extends parent

	public static void main(String[] args) {
		Parent p1= new Child();// Creating constructor
		// 
		p1.car();
		p1.gold();
		p1.house();
		p1.tv();

		
	}
	public void car() {
		System.out.println("I drive a blue car");
	}
	protected void house() {
		System.out.println("My house is red");
	}
	void tv() {
		System.out.println("I'm watching Cartoon");
	}
public Child() {
	super();
}

}
