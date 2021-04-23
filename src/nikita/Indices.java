package nikita;

public class Indices {


	int[] sum(int[] n, int targetnum) {
		
		for(int i=0;i<n.length;i++) {
			for(int j=0;j<n.length;j++) {
				int s= n[i]+n[j];
				if(targetnum==s) {
					int[] num= {i,j};
					System.out.println(i+" "+j);
					return num;
					
				}
			}
		}
		return n;
	}


public static void main(String args[]) {

	int[] n= {2,11,15,7,4};
	Indices i=new Indices();
	i.sum(n, 9);
	
}

}