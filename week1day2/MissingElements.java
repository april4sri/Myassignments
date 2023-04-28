package week1day2;

public class MissingElements {

	public static void main(String[] args) {
	int[]arr= {3,4,5,1,6,7,8,9,10};
	int n= arr.length+1;
	int sum=(n*(n+1))/2;
	for (int i=0;i<arr.length;i++) {
		sum =sum-arr[i];
		break;
	}
	System.out.println("The Missing number is "+ sum);

	}

}
