package introduction;

class parent
{
	String pname;
	public void setparentdata()
	{
		pname="vipulbhai patel";
		}
}
	class child1 extends parent
	{
		String cname;
		public void setchilddata()
		{
			cname="keya";
		}
		public void display()
		{
			System.out.println(cname+" "+pname);
			}
	}
	class child2 extends parent
	{
		String cname;
		public void setchilddata()
		{
			cname="neev";
		}
		public void display()
		{
			System.out.println(cname+" "+pname);
			}
	}
	
	
public class keyextend {

	public static void main(String[] args, child1 c2)
	{
		child1 c1=new child1();
		c1.setparentdata();
        c2.setchilddata();
        c2.display();
	}
}



