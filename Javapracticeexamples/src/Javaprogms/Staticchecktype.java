package Javaprogms;

public class Staticchecktype {

	int i=10;
	String  s= "Testing";
	static String s2 = " Satic variable";
	
	public  static void main(String[] args) {
		// TODO Auto-generated method stub
		Staticchecktype objects3 = new Staticchecktype();
System.out.println("display i value" + objects3.i);
System.out.println("display normal text  value" + objects3.s);
System.out.println("display static variable with object " + objects3.s2);
System.out.println("display static variable without object  " + s2);

	}

}
