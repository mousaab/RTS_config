package test;

public class Dove extends Bird{
	public int getAge()
	{
		return super.age;
	}
	public static void main(String []args)
{
	Dove d=new Dove();
	System.out.println(d.getAge());
	}
}
