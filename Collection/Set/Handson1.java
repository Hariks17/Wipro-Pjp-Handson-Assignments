package Set;

import java.util.HashSet;
import java.util.Iterator;

public class Handson1 {
	
	HashSet<String> h=new HashSet<String>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Handson1 handson=new Handson1();
		handson.addCountry("India");
		handson.addCountry("USA");
		handson.addCountry("UAE");
		handson.addCountry("UK");
		//System.out.println(handson.findCountry("ihsrg"));
		handson.printAllCountries();
		}
	public boolean addCountry(String countryName)
	{
		return h.add(countryName);
		
	}
	public String findCountry(String countryName)
	{
		if(h.contains(countryName))
		return countryName;
		else
		return "Country Not found";
				
		
	}
	void printAllCountries()
	{
		System.out.println(h);
		for(Iterator i=h.iterator();i.hasNext();)
		{
			System.out.println(i.next());
		}
	}


}
