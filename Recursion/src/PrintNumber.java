
public class PrintNumber 
{
public static void print(int n)
{
	if(n==0)
	{
		return;
	}
	//print(n-1);  // it's print 1 2 3 4 5 6 7 .....
	System.out.print(n+" ");
	print(n-1);    // it's print 10 9 8 7 6 ......
}
public static void main(String[] args)
{
print(10);	
}
}
