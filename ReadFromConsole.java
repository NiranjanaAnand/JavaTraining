import java.io.BufferReader ;
import java.io.InputStreamReader ;
import java.io.IOException ;

public class ReadFromConsole
{
	public static void main(String[] args)
	{
	String[] name ;
		try
		{	
			BufferReader bufferreader = new BufferReader(new InputStreamReader(System.in));
			for (int i=1; i<3; i++)
			{
			
				System.out.println("Enter name ");
			String name = bufferreader.readLine();
			}
		
		}
		catch (IOException i)
		{
			i.printStackTrace();
		}

		System.out.println ("Names entered") ;

		for (i=1 ; i<=3 ;i++)
		{
		  System.out.println(" Name " + i + " = " + name[i]) ;
		}
		
	
	}
}