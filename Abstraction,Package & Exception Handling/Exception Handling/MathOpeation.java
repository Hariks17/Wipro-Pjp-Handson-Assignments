package Exception;

public class MathOpeation {
public static void main(String args[])
{
	try {
		int sum=0;
		int array[]=new int[5];
		for(int i=0;i<5;i++)
		{
			array[i]=Integer.parseInt(args[i]);
			sum+=array[i];
		}
		System.out.println("Sum : "+sum+" Average : "+sum/5);
		
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
}
