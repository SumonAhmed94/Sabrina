package sharna;

public class InstanceVariable {
int bread=5;
int milk=3;
int egg=3;
long cashGiven=30;
	public static void main(String[] args) {
		InstanceVariable iv = new InstanceVariable();
		iv.groceries();

	}
//bread=5
//egg=3
	//milk=3
	//cashGiven=30
	//total spend, cashback
	public void groceries() {
	long totalSpend=(bread+milk+egg);
	long changeBack=(cashGiven-totalSpend);
	System.out.println("I will get"+" "+"$"+changeBack);
	
	}
	
}
