package sharna;

public class StaticVariable {
static int apple = 5;
int orange=10;
	public static void main(String[] args) {
	m1();
	StaticVariable sv= new StaticVariable();
	sv.m2();


	}

	public static void m1() {
	System.out.println(apple);
	}
	public void m2() {
	System.out.println(orange);
	System.out.println(apple);
	}

	
}
