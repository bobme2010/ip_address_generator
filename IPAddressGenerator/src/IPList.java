import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

public class IPList 
{
	private HashMap<String,String> iplist = new HashMap<String,String>();
	
	public void getipList(int count) throws IOException
	{
		IPInfo ip = new IPInfo();
		iplist.clear();

		while(iplist.size()<count)
		{
			ip.generate();
			String tmp = ip.toString();
			iplist.put(tmp, tmp);
		}
		
		StringBuilder sb = new StringBuilder();
		
		Iterator<String> it =  iplist.values().iterator();
		
		while(it.hasNext())
		{
			String ipAddress = it.next();
			sb.append( ipAddress + "\r\n");
		}
			
		

		FileWriter writer = new FileWriter("iplist.txt", false);
		writer.write(sb.toString());
        writer.close();
	}
	
}
