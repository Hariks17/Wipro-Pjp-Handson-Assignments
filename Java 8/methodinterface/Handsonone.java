package methodinterface;

interface Calculate{
	public int factorial(int n);
}
public class Handsonone {
	public int calcFactorial(int n)
	{
		int fact=1;
		for(int i=n;i>=1;i--)
			fact*=i;
		return fact;
		
	}

	public static void main(String[] args) {
		Handsonone hand=new Handsonone();
		Calculate fact=hand::calcFactorial;
		System.out.println(fact.factorial(6));
		
			
	}

}
