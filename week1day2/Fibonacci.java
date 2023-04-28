package week1day2;

public class Fibonacci {

	public static void main(String[] args) {
		int n = 10, fTerm = 0, secTerm = 1;
	    System.out.println("Fibonacci Series till " + n + " terms:");

	    for (int i = 1; i <= n; ++i) {
	      System.out.print(fTerm + ", ");

	      int nextTerm = fTerm + secTerm;
	      fTerm = secTerm;
	      secTerm = nextTerm;
	    }
	  }
	

	}


