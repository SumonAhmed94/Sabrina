package family;

import accessModifier1.Brother;
import accessModifier1.Sister;

public class Siblings extends Brother {

	public static void main(String[] args) {
		Brother.houseAccess();// Proted Access modifier calling from different package
		Brother bro2 = new Brother();
		bro2.library();

	}
	// In a same package create 4 class (package name = accessModifier2)
	//class name (Public-BOFA,Protected=Wels Fargo, Private= citibank, default=pnc)
	// wels fargo checking account=20000
	// BOFA checking account=10000, savings =20000
	// citibank IRA Account = 80000
	// pnc mortgage=250000
	
    // Package name =Customer (2nd p)
	//class name= Client
    
}
