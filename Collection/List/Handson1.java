package List;

import java.util.ArrayList;
import java.util.Iterator;

public class Handson1 {
public static void main(String args[])
{
ArrayList<String> arrayList=new ArrayList<String>();
arrayList.add("apple");
arrayList.add("ball");
arrayList.add("cat");
Handson1 handson=new Handson1();
handson.printAll(arrayList);

}
public void printAll(ArrayList<String> list)
{
	Iterator it=list.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
}
}
