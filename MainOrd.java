public class MainOrd
{
	public static void main(String[] args)
	{
	     SchoolOrd s = new SchoolOrd() ;
	     SchoolOrd a = new AltamontOrd();
	     AltamontOrd ab = new AltamontOrd();
             s.printSchool("Charter");
	     a.printSchool("croce");
             ab.printSchool("croce", "livermore");
	     if (!ab.printSchool("Sadhana", 4))
		{
		   System.out.println("false");
		}
	     else
		{
		   System.out.println("true");
		}
	}


}