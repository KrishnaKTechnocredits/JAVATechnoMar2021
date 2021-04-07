package krati_Shukla;

class StudentInfo
{
	String name = "Krati";
	String middleName = "N/A";
	String surName = "Chaturvedi";
	String address = "Thane , Mumbai";
	String birthDate = "02-Jan-1996";
	int rollNo = 22;
	
	void studentName()
	{
		System.out.println(name);
		System.out.println (middleName);
		System.out.println(surName);
		
	}
	
	void studentOtherDetails()
	{
		System.out.println(birthDate);
		System.out.println(address);
		System.out.println(rollNo);
	}
	
	public static void main (String[] args)
	{
		StudentInfo StudentInfo = new StudentInfo();
		StudentInfo.studentName();
		StudentInfo.studentOtherDetails();
	}
}
		
	
	
	