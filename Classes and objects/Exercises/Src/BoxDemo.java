class Box
{

 public static double width;
 public static double height;
 public static double depth;
public static void SetDim()
{
	width =1.33;
	height=2.44;
	depth=3.55;
}
public static double volume()
{
  double vol;
  vol=width*height*depth;
  return(vol);
}
}

class BoxDemo
{
	public static void main(String args[])
	{
      Box B1= new Box();
      
      double d;
      Box.SetDim();
      d=Box.volume();

      System.out.println(d);
	}
}