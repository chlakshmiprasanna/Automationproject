package Javaprogms;

public class MainmethodOverloading {

	public static void main(int i) {
		System.out.println("Main method only int as argumant" + i);
	}
	
	public static void main(String s1) {
		System.out.println("Main methos String as argument" + s1);
		
	}


	public static void main(String[] args) {

		System.out.println("Main method string[] args as argument");
		main (23);
		main ("Prasanna");
	}

}
