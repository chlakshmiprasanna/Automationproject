package Krishnaquestions;

public class Factorialprog {
	 static int factorial(int n)
	{
		if (n==0)
			return 1;
		else 
			return  (n* factorial(n-1));
	}

	 static public  void main(String[] args) {
    /*int i, fact =1,number = 5;
    System.out.println("Number is " + number);
    for(i=1;i<=number;i++)
    	fact =fact*i;
    System.out.println("Factorial of " + number + " is " +fact); */
	int number =8;	
    factorial(number);
    System.out.println("Factorial of " + number + " is " +factorial (8));
	}

}
