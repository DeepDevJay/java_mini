class Test1
{	
	public void sum(int a, int b)
	{
		int c = a + b;
		System.out.println(" Sum of " + a + " and " + b + " is : " + c );	
	}

	public void student()
	{
		String name = "Jaydip";
		int roll_no = 81;
		String Div = "A";

		System.out.println(" Name is : " + name);
		System.out.println(" Roll no. is : " + roll_no);
		System.out.println(" Division is : " + Div);
	}
	
	public static void main(String arr[])
	{
		System.out.println(" This is the starting of java miniproject \n ");  // first commit

		Test1 t1 = new Test1();
		t1.sum(50,20);                                                     // second commit

		System.out.println("\n");

		Test1 t2 = new Test1();
		t2.student();									// third commit
	}
}