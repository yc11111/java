import java.util.*;
class Array{
	public static void main(String[] args) {
		Scanner pc=new Scanner(System.in);
		System.out.println("How many numbers do you want to enter?");
		int p=pc.nextInt();
		int q=pc.nextInt();

		int A[][]=new int[p][q];
		int i,j;
		for(i=0;i<p;i++)
		{
			for(j=0;j<q;j++)
			{
				int r=pc.nextInt();
				 if(r>99)
				 {
				 	System.out.println("Number is invalid");
				 }
				 else
				 {
				 	A[i][j]=r;
				 }

			}
		}
		for(i=0;i<p;i++)
		{
			for(j=0;j<q;j++)
			{
				if(A[i][j]%2==0)
				{
					System.out.println(A[i][j]);
				}
				else
				{
					System.out.println(A[i][j]*2);
				}
			}
		}

	}
}