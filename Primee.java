package week1a.day1a;

public class Primee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numb= 5;
		boolean prime = true;
		for (int i=2;i<numb;i++) 
		{
			if (numb % i == 0) {
				prime = false;
				break;
			
		}}
		
		if (prime == true)
		{
			System.out.println(numb + " Number is a prime");
			
		}
		
		else
		{
			System.out.println(numb + " Number is a not prime");
		}
	}

}
