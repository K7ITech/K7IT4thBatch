class addition
{
	void sum(int a,int b);
	{
		int s= a+b;
		System.out.println("the sum of the numbers:"+s);
	}
	void sum(int a, int b, int c);
	{
		int t= a+b+c;
		System.out.println("the sum of the numbers:"+t);
	}
public static void main(String[] args)
{
addition abc=new addition();
abc.sum(10,20);
abc.sum(10,20,30);
}
}