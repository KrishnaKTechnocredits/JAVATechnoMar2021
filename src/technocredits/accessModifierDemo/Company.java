package technocredits.accessModifierDemo;

public class Company {
	private static  String defaultIP = "127.1.1.1";
	
	void getCompanyPolicyDetails() {
		boolean isValidIp = getConnection("127.43.34.53");
		if(isValidIp)
			System.out.println("Give all details about policy");
		else
			System.out.println("You are not authorized user");
	}
	
	private boolean getConnection(String ip) {
		///// to confirm valid ip address
		return true;
	}
}
