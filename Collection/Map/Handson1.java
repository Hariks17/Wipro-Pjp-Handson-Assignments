package Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Handson1 {

static HashMap<String,String> mapobj=new HashMap<String,String>();
	public static void main(String args[]) {
	
		Handson1 hands=new Handson1();
		hands.saveCountry("India", "Delhi");
		hands.saveCountry("Japan", "Tokyo");
		System.out.println(hands.getCapital("India"));
		hands.anotherMap(mapobj);
		System.out.println(hands.returnKeys(mapobj));
		System.out.println(hands.returnValues(mapobj));
	}
	public String saveCountry(String countryName,String capitalName)
	{
		
		return mapobj.put(countryName, capitalName);
		
	}
	public String getCapital(String countryName)
	{
		if(mapobj.containsKey(countryName))
		return mapobj.get(countryName);
		else
		return "No Country Found";		
		
	}
	public HashMap<String,String> anotherMap(HashMap<String,String> mapobj)
	{
		HashMap<String,String> mapobj2=new HashMap<String,String>();
		 Set set=mapobj.entrySet();
		 
		 Iterator i=set.iterator();
		 while(i.hasNext())
		 {
			 Map.Entry me=(Map.Entry)i.next();
			 String countryName=(String) me.getKey();
			 String capitalName=(String) me.getValue();
			 mapobj2.put(countryName,capitalName);
			 
		 }
		 System.out.println(mapobj2);
		
		return mapobj;
		
	}
	public ArrayList<String> returnKeys(HashMap<String,String> mapobj)
	{
		ArrayList<String> keys=new ArrayList<String>(mapobj.keySet());
		return keys;		
		
	}
	public ArrayList<String> returnValues(HashMap<String,String> mapobj)
	{
		ArrayList<String> values=new ArrayList<String>(mapobj.values());
		return values;		
		
	}
}
