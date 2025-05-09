package introduction;

abstract class triangle
{
	abstract void   area();
}

class circle extends triangle
{
	double radius;
	public circle(double radius)
	{
		this.radius=radius;
	}
	@Override
	void  area ()
	{
		double area=Math.PI*radius*radius;
		System.out.println("area of cirlce"+area);
	}
}
	
public class abstarct {

	public static void main(String[] args)
	{
		circle circle=new circle(4.0);
       circle.area();
	}

}

	

