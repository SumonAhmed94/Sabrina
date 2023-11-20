package accessModifier1;

public class Brother {

	public static void main(String[] args) {
		// Publi=Access Modifier
		// Static=Access Pacifier
		// Void=Return Type
		// Main=Method Name
		Brother bro = new Brother();
		bro.personalProperties();
		bro.roomAccess();
		houseAccess();
		bro.library();
		
	}

	private float money;

	private void personalProperties() {// It's a private access modifier
		money = 30000;
		System.out.println("Sumon's Wallet" + " " + money);

	}

	void roomAccess() {// default modifier// Default modifier can have access different class, 
		money = 40000;
		System.out.println("room Access");
	}

	protected static void houseAccess() {// protected modifier
		// if we wanna use different package we have to use keywords EXTENDS
		System.out.println("house Access");
	}

	public void library() {// public modifier
		System.out.println("Library");
	}
}
