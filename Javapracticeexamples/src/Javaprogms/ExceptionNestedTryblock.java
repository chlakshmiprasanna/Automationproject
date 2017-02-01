package Javaprogms;

import java.rmi.AlreadyBoundException;

public class ExceptionNestedTryblock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int i = 0 ;
    int a[]=new int[5];  
   try{
	     try{
       	    System.out.println("Value of i is " + i);
    	    int j =1/i;
    	    }
	        catch (ArithmeticException e)
            {
	        System.out.println(e);
    		System.out.println("Arithmetic exception occured as j value divisible by '0' ");
            }
	     try
	        {
		    a[5]=4;  
	        }
	        catch (ArrayIndexOutOfBoundsException e)
	        { 
	        System.out.println(e);
		    System.out.println("Array is out of range exception");
	        }
	 }
   catch (Exception e)
   {
   	   System.out.println(e);
	   System.out.println("Exception catch for final try block");
   }
	}    

}
