package week1a.day1a;

public class Browser {
	
	public String launchBrowser(String browsername) {
        System.out.println("BrowserName is : " + browsername);
        return browsername;
    }
	
	public String loadUrl() {
        return "Url loaded successfully";
		//System.out.println("Url loaded successfully");
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Browser BWR = new Browser();
		BWR.launchBrowser("FIREFOX");
		//BWR.loadUrl();
		String message = BWR.loadUrl();
		System.out.println(message);

	}

}
