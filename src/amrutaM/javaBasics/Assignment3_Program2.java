package amrutaM.javaBasics;

/*Program 2: Validate Browser name.
Valid list : Chrome, IE, Edge --> Valid browser
Safari, FF -> Invaild browser

Note : score == 10
String browser = "Chrome";
Hint: browser.equals("Chrome") || browser.equals("IE") || browser.equals("Edge") 
*/
public class Assignment3_Program2 {

	void validateBrowserName(String browser) {
		if (browser.equals("Chrome") || browser.equals("IE") || browser.equals("Edge")) {
			System.out.println("Valid Browser");
		} else if (browser.equals("Safari") || (browser.equals("FF"))) {
			System.out.println("Invalid browser");
		}

	}

	public static void main(String[] args) {
		Assignment3_Program2 assignment3_Program2 = new Assignment3_Program2();
		assignment3_Program2.validateBrowserName("Chrome");
		assignment3_Program2.validateBrowserName("IE");
		assignment3_Program2.validateBrowserName("Safari");
		assignment3_Program2.validateBrowserName("Edge");
		assignment3_Program2.validateBrowserName("FF");
	}
}
