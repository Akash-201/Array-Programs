package Array;

public class Array_reverse 
{
public static void print(int[] num)
{
//	for(int i=num.length-1;i>=0;i--)
//	{
//		System.out.print(num[i]+" ");
//	}
	//----------(while loop)-------------
//	int i=num.length-1;
//	while(i>=0) 
//	{
//		System.out.print(num[i]+" ");
//		i--;
//	}
	
	//---------(do while loop)----------------------------------------------------
	int i=num.length-1;
	do
	{
		System.out.print(num[i]+" ");
	i--;
	}
	while(i>=0);
}
public static void main(String[] args) 
{
int[] num= {1,2,3,4,5,6};
print(num);
}

}
