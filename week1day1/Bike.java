package week1day1;

public class Bike {
	public void applyIndicator()
	{
		System.out.println("Apply the indicator");
	}
	public static void main(String[] args) {
		Car brake=new Car();
		brake.applyBreak();
		brake.soundHorn();
		Bike bik =new Bike();	
		bik.applyIndicator();
	}
	

}
