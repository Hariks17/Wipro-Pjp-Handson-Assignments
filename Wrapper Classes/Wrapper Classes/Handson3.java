import java.util.Scanner;

public class Handson3 {
	
	
	public static void main(String[] args) {
			
			
			int input = new Scanner(System.in).nextInt();			
			String output = String.format("%8s", Integer.toBinaryString(input)).replace(' ', '0');			
			System.out.println(output);
			
			
			

		

	}
}
