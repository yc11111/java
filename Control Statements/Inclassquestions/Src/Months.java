import java.util.Scanner;
class Months
{
	public static void main(String args[])
	{
		int m;
		int x;
		Scanner s = new Scanner(System.in);
		System.out.println("enetr a number between 1 to 12");
		m = s.nextInt();
		do
		{
		switch(m)
		{
			case 1 :
			{
				if (m==1)
				System.out.println("january");
			  break;
			}

			case 2 :
			{
				if (m==2)
				 System.out.println("february");
				break;
			}

			case 3 :
			{
				if (m==3)
					System.out.println("march");
				break;
			}

			case 4 :
			{
				if (m==4)
					System.out.println("april");
				break;
			}

			case 5 :
			{
				if (m==5)
					System.out.println("may");
				break;
			}

			case 6 :
			{
				if (m==6)
					System.out.println("june");
				break;
			}

			case 7 :
			{
				if (m==7)
					System.out.println("july");
				break;

			}
             
             case 8 :
             {
             	if (m==8)
             		System.out.println("august");
             	break;
             	 }

             	 case 9 :
             	 {
             	 	if (m==9)
             	 		System.out.println("september");
             	 	break;
			     }

			     case 10 :
			     {
			     	if (m==10)
			     		System.out.println("october");
			     	break;
			    }

			    case 11 :
			    {
			    	if (m==11)
			    		System.out.println("november");
			    	break;
			    }

			    case 12 :
			    {
			    	if (m==12)
			    		System.out.println("december");
			    	break;

			    }
			 
			 default :
			 System.out.println("re-enetr the no. between 1 to 12");
		}
		System.out.println("do you want to enter again then enter 15");
		x = s.nextInt();

		}while (x==15);

	}

}