package inheritance;

public class Parent {

	public static void main (String[] args) {
		//parent method eligible to access child method besides private
		//parent method can access to child method
		//parent can't access child properties
		// inheritance is a one way relationship
		
	}
public void car() {
	System.out.println("i drive my car");
}
protected void house() {
	System.out.println("i live in my house");
}
void tv() {
	System.out.println("i watch tv");
}
private void cash() {
	System.out.println("i keep cash");
}
final void gold() {
	System.out.println("i have a gold chain");
}
}
