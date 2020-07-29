package List;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Handson3 {
public static void main(String args[])
{
Vector<Integer> vector=new Vector<Integer>();
vector.add(10);vector.add(17);vector.add(7);vector.add(21);
vector.add(65);
Enumeration<Integer> enume= Collections.enumeration(vector);
while(enume.hasMoreElements())
{
System.out.println(enume.nextElement());
}
System.out.println("Using Iterator");
for(Iterator i=vector.iterator();i.hasNext();)
{
	System.out.println(i.next());}
}
}
