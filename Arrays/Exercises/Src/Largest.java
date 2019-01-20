import java.util.*;
class Largest{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the numbers");
		int a[]=new int[5];
		int i;
		
		for(i=0;i<5;i++)
		{
			
			a[i]=scan.nextInt();
		}
		System.out.println("The given array is:" );
		for (i = 0; i < a.length; i++) {
			System.out.println(a[i]+"\t");
		}
		int p;
		System.out.println("Enter your choice");
		p=scan.nextInt();
		switch(p)
		{
			case 1:int max=0;
		for(i=0;i<5;i++)
		{
			if(a[i]>max)
			{
				max=a[i];

			}
			
		}

		System.out.println("largest value is"+max);
		break;
			case 2:int largest = a[0];
		int secondLargest = a[0];
		
		
		for (i = 0; i < a.length; i++) {
 
			if (a[i] > largest) {
				secondLargest = largest;
				largest = a[i];
 
			} else if (a[i] > secondLargest) {
				secondLargest = a[i];
 
			}
		}
 
		System.out.println("\nSecond largest number is:" + secondLargest);
		break;
			case 3:int sum=0;
		for(i=0;i<5;i++)
		{
			sum+=a[i];
			i++;
			
		}

		System.out.println("Sum of alternate number is"+sum);
		sum=0;
		for(i=1;i<5;i++)
		{
			sum+=a[i];
			i++;
		}
		System.out.println("Sum of alternate number is"+sum);
		break;
			case 4:
		int count=0;
		for(i=0;i<5;i++)
		{
			if(a[i]%2==0)
			{
				count++;
			}
		}
		System.out.println("total no of even number is :"+count);
		break;
			case 5:sum=0;
		for(i=0;i<5;i++)
		{
			sum+=a[i];
		}
		System.out.println("Sum of all elements of array is"+sum);
		break;
			case 6:count=0;
		System.out.println("Enter the number you want to check for Occurence");
		int n=scan.nextInt();
			for(i=0;i<5;i++)
			{
				if(n==a[i])
				{
				count++;
				}
		}
		System.out.println("Occurence is"+count);
		break;
			
		}

	}
}