import java.io.IOException;

public class Booter {

	public static void main(String[] args) throws IOException
	{
		IPList iplist = new IPList();
		
		iplist.getipList(10000);
		
		System.out.println("finished!");
	}

}
