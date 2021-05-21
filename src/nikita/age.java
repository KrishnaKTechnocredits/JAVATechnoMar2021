package nikita;

public class age {
	static int[] n= {7,45,62,56,52};
	int max=0;
	int min=n[0];
	 void mini(int[] n) {
		
		
		for(int i=0;i<n.length;i++) {
			if(n[i]<min)
				min=n[i];
			
			//return min;
		}
		System.out.println("min numb is "+min);
		//return min;
	}	
	
	void maxi(int[] n) {
		
		for(int i=0;i<n.length;i++) {
			if(n[i]>max)
				max=n[i];
			
			
	}
		System.out.println("MAx numb is "+max);
}
	
	 int getdifference() {
		 //int min=0;
		int ans=max-min;
		System.out.println("the age diff is "+ans);
		return ans;
		
	}
	
public static void main(String args[]) {
	
	age a=new age();
	a.maxi(n);
	a.mini(n);
	a.getdifference();
	
}
}
