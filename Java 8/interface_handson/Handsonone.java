package interface_handson;

interface Vehicle{
	default void message()
	{
		System.out.println("Inside Vehicle");
	}

}
interface FourWheeler{
	default void message()
	{
		System.out.println("Inside FourWheeler");
	}
}
class Car implements Vehicle,FourWheeler{

	@Override
	public void message() {
		// TODO Auto-generated method stub
		Vehicle.super.message();
	}

	

	
}
public class Handsonone {
	public static void main(String args[]) {
		Car car=new Car();
		car.message();
	}

}
