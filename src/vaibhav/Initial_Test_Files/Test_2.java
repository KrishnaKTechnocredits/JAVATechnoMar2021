package vaibhav.Initial_Test_Files;

public class Test_2 {
		String stdName = "Vaibhav";
		String mName = "Nagnath";
		String surName = "Tati";
		String dob = "14th July 1992";
		String address = "Ravet";
		int rollNumber = 101;
			
		
		void studentName(){
			System.out.println(stdName);
			System.out.println(mName);
			System.out.println(surName);
		}
		
		void studentOtherDetatils(){
			System.out.println(dob);
			System.out.println(address);
			System.out.println(rollNumber);
		}
		
		public static void main(String[] args){
			Test_2 s1 = new Test_2();
			s1.studentName();
			s1.studentOtherDetatils();
		}
	}

