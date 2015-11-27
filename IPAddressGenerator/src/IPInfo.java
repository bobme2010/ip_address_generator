
public class IPInfo 
{
	private int A1 = 0;
	private int A2 = 0;
	private int A3 = 0;
	private int A4 =0;
	
	private java.util.Random random=new java.util.Random();
			
	public String toString()
	{
		return A1 + "." + A2 + "." + A3 + "." + A4;
	}
	
	public void generate()
	{
		A1 =  1+ getValue(99);
		A2 = 1 + getValue(9);
		A3 = 1 + getValue(99);
		A4 = 1 + getValue(9);		
	}	
	
	private int getValue(int min_value)
	{
		
		while(true)
		{
			int x =  random.nextInt(255);
			
			if(x >= min_value)  return x;
		}
		
	}
}
