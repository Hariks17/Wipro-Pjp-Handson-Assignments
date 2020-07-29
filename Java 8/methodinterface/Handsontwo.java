package methodinterface;

interface CalculateDigit{
	public int countDigit(int n);
}
public class Handsontwo {
	public static int digitCount(int n)
	{
		return String.valueOf(n).length();
		
	}

	public static void main(String[] args) {
		CalculateDigit dcount=Handsontwo::digitCount;
		
		System.out.println(dcount.countDigit(124567));
		
			
	}
}
