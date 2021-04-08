package madhavi_Khasbage.ParameterMethodDataType;

class Human
{
	String humanName;
	boolean flag;
	int age;
	
	void setHumanName(String hName){
		humanName=hName;
	}
	
	void setCanHeSpeak(boolean flag1){
		flag=flag1;
	}
	
	void setHumanAge(int age1){
		age=age1;
	}
	
	void showDetails(){
		System.out.println("Human name = " + humanName);
		System.out.println("Can he speak = " + flag);
		System.out.println("Age  = " + age);
	}
	   
	public static void main(String[] agrs){
		Human objHuman=new Human();
		objHuman.setHumanName("Manas");
		objHuman.setCanHeSpeak(true);
		objHuman.setHumanAge(25);
		objHuman.showDetails();
	}
	
}