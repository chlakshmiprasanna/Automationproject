package Javaprogms;

public class MainwithoutStatic {

	int i=10;
	String  s= "Testing";
	static String s2 = " Satic variable";
	
	public  void main(String[] args) {
		// TODO Auto-generated method stub
		Staticchecktype objects3 = new Staticchecktype();
System.out.println("display i value" + i);
System.out.println("display normal text  value" + s);
System.out.println("display static variable with object " + s2);
System.out.println("display static variable without object  " + objects3.s2);

	}

}