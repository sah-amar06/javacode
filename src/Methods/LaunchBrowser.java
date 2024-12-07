package Methods;

public class LaunchBrowser {
	
	public boolean browser(String browserName) {
		System.out.println("Launching the browser : " +browserName);
		
		if(browserName.equals("Chrome")) {
			System.out.println("Chrome is launched....");
			return true;
		}
		else if(browserName.equals("FireFox")) {
			System.out.println("FireFox is launched....");
			return true;
		}
		else if(browserName.equals("Edge")) {
			System.out.println("Edge is launched....");
			return true;
		}
		else if(browserName.equals("Safari")) {
			System.out.println("Safari is launched....");
			return true;
		}
		else
		{
			System.out.println("Enter the corect browser...");
			return false;
		}
	}
		

	public static void main(String[] args) {
		
		LaunchBrowser br = new LaunchBrowser();
		br.browser("Chrome");
		
		boolean flag = br.browser("Edge");
		if(flag) {
			System.out.println("Enter the url");
		}else {
			System.out.println("No need to enter url");
		}

	}

}
