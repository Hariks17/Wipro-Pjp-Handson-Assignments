package optionalclass;

import java.util.Optional;

public class Handsonone {

	String names[]=new String[5];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Handsonone hand=new Handsonone();
		Optional<String> o=Optional.ofNullable(hand.names[0]);
		if(o.isPresent())
		{
			System.out.println(o.get());		}
		else
		{
			System.out.println("Null Value");
		}
		
	}

}
