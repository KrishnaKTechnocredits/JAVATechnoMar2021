package nikita.Missing;

public class MissingNum {

	int arr[]= {1,3,4,7,9,10};
	int sum=0;
	boolean numbpresent;
	int n;
	int getmissingnum() {
		for(int n=1;n<10;n++) {
			numbpresent=false;
			for(int i=0;i<arr.length;i++) {
				if(n==arr[i]) {
					numbpresent=true;
					break;
					
				}
				
			}
			if(numbpresent==false) {
				System.out.println(n);
				//sum=sum+n;
				//System.out.print("The sum of missing number are:"+sum);
			}
		}
		return n;
	}
	
	int getSum() {
		for(int n=1;n<10;n++) {
			numbpresent=false;
			for(int i=0;i<arr.length;i++) {
				if(n==arr[i]) {
					numbpresent=true;
					break;
					
				}
				
			}
			if(numbpresent==false) {
				sum=sum+n;
			}
		}
		System.out.println("The sum of missing number is: "+sum);
			return sum;
	}
	
		
		int getMaxMissingNum() {
			
			int max=0;
			for(int n=1;n<10;n++) {
				numbpresent=false;
				for(int i=0;i<arr.length;i++) {
					if(n==arr[i]) {
						numbpresent=true;
						break;
						
					}
					
				}
				if(numbpresent==false && n>max) {
					max=n;
				}
			}
			System.out.println("The max numb from missing numbers is: "+max);
				return max;
		}
			
			
		
		
	
public static void main(String[] args) {
	

MissingNum m=new MissingNum();
m.getmissingnum();
m.getSum();
m.getMaxMissingNum();
	
}
}

