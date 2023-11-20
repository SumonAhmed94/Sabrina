package constructor;

public class ConstructorHW {

	public static void main(String[] args) {
		// class name cars
		// Car name
		// Dealer name
		// Car year
		// Car color
		// 4 color // 4 object
		// registration fee // method
		// buying day with return value // method
		// Cars Fee

		Cars cr1 = new Cars("Accord", 2014, "Silver", 11500,"Monday");
		cr1.purchaseDay();
		cr1.carFee(1500);

		Cars cr2 = new Cars("Acura", 2021, "Black", 49000,"Tuesday");
		cr2.purchaseDay();
		cr2.carFee(3500);

		Cars cr3 = new Cars("Torota", 2018, "White", 21000,"Friday");
		cr3.purchaseDay();
		cr3.carFee(2300);

		Cars cr4 = new Cars("Accord", 2014, "Red", 10000,"Saturday");
		cr4.purchaseDay();
		cr4.carFee(2500);
	}
	}

class Cars {
	public Cars () {
		super();
	}
	String name;
	int year;
	String color;
	double price;
	String purchaseDay;
	
	public Cars (String name, int year, String color,double price, String purchaseDay ) {
		this.name=name;
		this.year=year;
		this.color=color;
		this.price=price;
		this.purchaseDay=purchaseDay;
		
		System.out.println(name+" "+year+" "+color+" "+price+" "+purchaseDay);
		
	}
    static String dealership="NurulAuto";
	
	public void carFee(double registrationFee) {
		
	System.out.println(dealership);
	System.out.println(registrationFee+price);
	}
	
	
	public String purchaseDay() {
	System.out.println(purchaseDay);
	return null;
		
	}
}