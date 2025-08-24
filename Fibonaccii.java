package week1a.day1a;

public class Fibonaccii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int range = 8;
        int F = 0;
        int S= 1;
        System.out.println("Fibonacci series till :" + range + ":");
        
        for (int i=0;i<=range;i++) 
        {
        	System.out.println(F);
        	int T = F + S;
        	F = S;
        	S = T;
        	
        }
        
	}

}
