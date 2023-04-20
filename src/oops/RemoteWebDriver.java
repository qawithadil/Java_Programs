package oops;

public class RemoteWebDriver implements WebDriver {

	@Override
	public void get() {
		System.out.println("Get URL in Remote Driver Code implementation...");

	}

	@Override
	public void getCurrentURI() {
		System.out.println("Get Current URL in Remote Driver Code implementation...");

	}

	@Override
	public void getTitle() {
		System.out.println("Get Title in Remote Driver Code implementation...");

	}

	public static void main(String[] args) {
		RemoteWebDriver rt = new RemoteWebDriver();
		rt.get();
		rt.getTitle();
		rt.getCurrentURI();
		

	}

}
