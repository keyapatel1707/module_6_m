package introduction;
class Car
{
	public Car() 
	{
		System.out.println("Default Constructor");
	}
	
	public Car(String name)
	{
		System.out.println("Car name: " + name);
	}
	
	public Car(String name, int price)
	{
		System.out.println("Car name: " + name);
		System.out.println("Car price: " + price);
	}
	

		public static void main(String[] args) 
		{
			{
				Car c = new Car();
				new Car("kia"); 
				new Car("Seltos", 1200000); 
			}
	}
}


