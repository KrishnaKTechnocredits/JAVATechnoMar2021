/*Assignment no1*/

package pravin;

class Studentinfo{
	String Name,MiddleName,LastName,Birthdate,Address;
	int rollnumber;

	void studentName(){

		Name = "Shikha";
		MiddleName = "Amit";
		LastName = "Patel";

		System.out.println(Name);
		System.out.println(MiddleName);
		System.out.println(LastName);

	}	

	void studentDetails(){
		Birthdate = "10 Aug 1988";
		rollnumber = 34;
		Address = "G-809, Heaven Apartment, Baner, Pune.";
		System.out.println(rollnumber);
		System.out.println(Address);

	}


	public static void main (String[] arg ){

		Studentinfo Studentinfo1= new Studentinfo();

		Studentinfo1.studentName();

		Studentinfo1.studentDetails();

	}
}
