package methodinterface;

interface CheckPrime{
	public void checkPrimeOrNot(int n);
}
public class Handsonthree {
	Handsonthree(int n)
	{
		int count=0;
		for(int i=1;i<=(int)Math.sqrt(n);i++)
		{
			if(n%i==0)
				count++;
		}
		if(count==1)
			System.out.println("Prime");
		else
			System.out.println("Not Prime");
	}

	public static void main(String[] args) {
		CheckPrime cprime=Handsonthree::new;
		
		cprime.checkPrimeOrNot(7);
			
	}
}
