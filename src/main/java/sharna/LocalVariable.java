package sharna;

public class LocalVariable {

	public static void main(String[] args) {
	billPayment();
	LocalVariable lv= new LocalVariable();
	lv.billPayment1();

	}
public static void billPayment() {
	int rent=1200;
	float utilities =79.4837f;
	double creditCard=579.43798324;
	double totalExpense=(rent+utilities+creditCard);
	System.out.println("My monthly Expense is"+" "+"$"+totalExpense);
}
public void billPayment1() {
	int rent=1200;
	float utilities =79.4837f;
	double creditCard=579.43798324;
	double totalExpense=(rent+utilities+creditCard);
	System.out.println("My monthly Expense is"+" "+"$"+totalExpense);
}
}
