package List;

import java.util.List;
import java.util.ArrayList;

public class Handson2 {
public static void main(String args[])
{
List<Object> arrayList=new MyArrayList<Object>();
arrayList.add(10);
arrayList.add(10.15);
arrayList.add(10.1444);
arrayList.add("hari");

System.out.println(arrayList);
}
}
class MyArrayList<Object> extends ArrayList<Object> {
	@Override
	public boolean add(Object o) {
		if (o instanceof Integer || o instanceof Float || o instanceof Double) {
			super.add(o);
			return true;
		} else {
			System.out.println("Only Int,Float and Double can be added");
		}
		return false;
	}
}	
	



