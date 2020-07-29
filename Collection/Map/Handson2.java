package Map;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map;

public class Handson2 {

	public static void main(String args[]) {
	
	TreeMap<String,Integer> treemap=new TreeMap<String,Integer>();
	treemap.put("harihome",912345);
	treemap.put("harioffice",923563);
	System.out.println(treemap.get("harihome"));
	Set set=treemap.entrySet();
	Iterator i=set.iterator();
	while(i.hasNext())
	{
		Map.Entry m=(Map.Entry)i.next();
		System.out.println(m.getKey()+"  "+m.getValue());
	}
	}
}
