import java.util.*;
class Sales{
	public static void main(String[] args)
	 {
	 	int a[][]=new int [4][5];
		Scanner scan=new Scanner(System.in);
		int n,row,column,cost=0;
		int total[]=new int[4];

		for(row=0;row<4;row++)
		{
			for(column=0;column<5;column++)
			{
				System.out.println("how many product "+(column+1)+"sold by salesman "+(row+1));
				n=scan.nextInt();
				if(column==0)
				{
					cost=100;
				}
				else if(column==1)
					{
						cost=150;
					}
					else if(column==2)
					{
						cost=200;
					}else if(column==3)
					{
						cost=250;
					}
					else if(column==4)
					{
						cost=300;
					}
					a[row][column]=n*cost;

			}

		}
		for(row=0;row<4;row++)
	{
			for(column=0;column<5;column++)
			{
				System.out.println(a[row][column]);
			}
			int sum=0;
			for(row=0;row<4;row++)
		{
			for(column=0;column<5;column++)
			{
				sum=sum+a[row][column];
			}
			total[row]=sum;			
		}
		for(row=0;row<4;row++)
		{
		System.out.println(total[row]);
	    }
	}

		
	}
}