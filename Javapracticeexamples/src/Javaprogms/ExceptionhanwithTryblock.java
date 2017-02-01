package Javaprogms;

public class ExceptionhanwithTryblock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try
{
	int i= 10/0;
	System.out.println("ArithmeticException prog with Try block" + i);
	System.out.println("Try block statements");
}
catch (ArithmeticException e)
{
    System.out.println("Display ArithmeticException error in catch block");	
	System.out.println("Catch  block second  statements");

}
    System.out.println("Statement 2 for other calculation");
	}

}
