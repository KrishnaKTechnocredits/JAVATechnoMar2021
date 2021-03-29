package milind;
/*Print all details of Student like Name, Middle name, Surname, birthdate, Address, and Roll number.
 * 
 */
class Example2
{
	String name="Milind";
	String middleName="Manohar";
	String surname="Khairnar";
	String birthday="11 may 1994";
	String address="G-501,Yashwin Apartment,Baner,Pune";
	int rollnumber=20;
	
	void StudentName()
	{
		System.out.println(name);
		System.out.println(middleName);
		System.out.println(surname);
	}
	void StudentOtherDetails()
	{
		System.out.println(birthday);
		System.out.println(address);
		System.out.println(rollnumber);
	}
	public static void main(String[] args)
	{
		Example2 studentInfo1 = new Example2();
		studentInfo1.StudentName();
		studentInfo1.StudentOtherDetails();
	
	}
}