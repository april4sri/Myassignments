package week1day2;

public class Palindrome {

	public static void main(String[] args) {
	int n1,sum=0,temp;
	int n=34343;
	temp=n;
	while(n<0)	
	{
		n1=n%10;
		sum=(sum*10)+n1;
				n=n/10;
				
	}
if(temp==n) 
	System.out.println("It is a palindrome number ");
else 
	System.out.println("not a palindrome number");
	

}
}