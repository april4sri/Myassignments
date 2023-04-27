package week1day1;

public class Mobile {
	
	public void makeCall()
	{
		String mobileModel="oppo";
		float mobileWeight=3.0f;
		System.out.println (mobileModel);
		System.out.println(mobileWeight);
		
	}
public void sendMsg()
{
 Boolean  isFullCharged=true;
int mobilCost=50000;
System.out.println(isFullCharged);
System.out.println(mobilCost);
}
	public static void main(String[] args) {
		Mobile mod =new Mobile();
		mod.makeCall();
		mod.sendMsg();
	System.out.println("This is my mobile ");

		
	}

}
