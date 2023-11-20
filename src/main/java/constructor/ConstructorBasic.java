package constructor;

public class ConstructorBasic {

	public static void main(String[] args) {
		Students stu1=new Students("Sumon", 001, 1000, "Summer");
		stu1.semester();
		stu1.studentFee(500);
		Students stu2=new Students("Ahmed", 002, 2000, "Fall");
		stu2.semester();
		stu2.studentFee(300);
	
	}

}
 
class Students {
	public Students () {
		super(); // default constructor
			
	}
	
	String name; //creating variable
	int id;
	double fee;
	String semester;

	
	//user define constructor
	
	public Students (String name, int id, double fee, String semester) { // constructor
		//super ();
		
		this.name=name; // instantiate the instance variable
		this.id=id;
		this.fee=fee;
		this.semester=semester;
		System.out.println(name+" "+id+" "+fee+" "+semester);
		
	}
	static String college="Virgina"; // its variable 

	
	public void studentFee(double admissionFee) { //its void method
		System.out.println(college);
		System.out.println(fee+admissionFee);
	}
	
	public String semester() { // its return method
		System.out.println(semester);
		return null;
	}
}