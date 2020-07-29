package interface_handson;

interface Test{
	abstract int myFunction(int a,int b,int c);
}

public class Handsontwo {
	public static void main(String args[]) {
		
		Test t1=(a,b,c)-> a+b+c;
		Test t2=(a,b,c)-> a*b*c;
		System.out.println(t1.myFunction(5, 8, 9));
		System.out.println(t2.myFunction(5, 8, 9));
		
	}

}
