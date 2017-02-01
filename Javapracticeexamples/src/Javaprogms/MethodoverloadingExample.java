package Javaprogms;

public class MethodoverloadingExample {

	 //int i,j;
	  int add;

	String s1,s2;
	void sum(int i ,int j)
	{
		add=i+j;
		System.out.println(add);
	}
	
	void sum(int a ,int b,int c)
	{
		System.out.println(a+b+c);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodoverloadingExample addobj = new MethodoverloadingExample();
	//	System.out.println(add); //Should be static as main method is static

		addobj.sum(2, 3);
		addobj.sum(3, 4,5);

	}

}
