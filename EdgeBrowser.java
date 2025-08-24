package week1a.day1a;

public class EdgeBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Browser BWR1 = new Browser();
		BWR1.launchBrowser("CHROME");
		//BWR1.loadUrl();
		String message1 = BWR1.loadUrl();
		System.out.println(message1);


	}

}
