public class AltamontOrd extends SchoolOrd
{
	public void printSchool(String name)
	{
	  System.out.println("Altamont Name : "+ name);
	}

	public void printSchool(String name, String area)
	{
		System.out.println("school name and area " +name+ " "+area);
	}

	public boolean printSchool(String name, int age) 
	{
	   if (name == "Sadhana")
	       {
		System.out.println("Sadhana here in Overloading if and my age is" + age);
		return true ;
		}
	   else
		{
		System.out.println("Yeah Sudhan in the else");
		return false ;
		}	
	
	}
}