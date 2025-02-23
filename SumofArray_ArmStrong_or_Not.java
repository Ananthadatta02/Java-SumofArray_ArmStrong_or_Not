package miscellaneous_Programs;

import java.util.Scanner;

public class SumofArray_ArmStrong_or_Not 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Array Size");
		int size  = s.nextInt();
		int arr[] = new int [size];
		System.out.println("Enter the Elements");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i] = s.nextInt();
		}
		int sum = 0;
		for(int i=0;i<=arr.length-1;i++)
		{
			sum += arr[i];
		}
		System.out.println("Sum of Array: "+ sum);
		int temp = sum;
		int temp2 = sum;
		int count = 0;
		while(temp>0)
		{
			int ld = temp%10;
			count++;
			temp/=10;
		}
		int value = 0;
		while(temp2>0)
		{
			int ld = temp2%10;
			value = value + power(ld,count);
			temp2/=10;
		}
		System.out.println(value);
		if(value == sum)
			System.out.println("ArmStrong Number");
		else
			System.out.println("Not ArmStrong Number");
	}
	
	public static int power(int base,int power)
	{
		int value = 1;
		for(int i=1;i<=power;i++)
		{
			value *= base; 
		}
		return value;
	}
}
