package monika.Practise1;

 class Employee extends Manager {
	private String s;
	Employee(String s){
		super(10); // 10 print
		this.s = s;
		System.out.println("Value: "+s +" Child Class constructor"); // Monika
	}
	
}
