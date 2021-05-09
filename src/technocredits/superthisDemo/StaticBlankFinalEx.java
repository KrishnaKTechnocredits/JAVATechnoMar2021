package technocredits.superthisDemo;

public class StaticBlankFinalEx {
	
	static final String browser;
	
	static{
		String env = "test";
		if(env.equals("test"))
			browser = "chrome";
		else
			browser = "ie";
	}
	
	static {
		
	}
}
