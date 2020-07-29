package optionalclass;

import java.util.Optional;

public class Handsontwo {
	String address;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Handsontwo hand=new Handsontwo();
		Optional<String> o=Optional.ofNullable(hand.address);
		System.out.print(o.orElse("India"));

	}

}
