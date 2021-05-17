package monika.Practise1;
//Time Complexity: O(M), where M is the maximum element of the array.
public class Test7_ShaCode {
	static void printMissingElements(int arr[], int N)
	{
	     
	    // Initialize an array with zero
	    // of size equals to the maximum
	    // element in the array
	    int[] b = new int[arr[N-1]+1];
	 
	    // Make b[i]=1 if i is present
	    // in the array
	    for(int i = 0; i < N; i++)
	    {
	         
	        // If the element is present
	        // make b[arr[i]]=1
	        b[arr[i]] = 1;
	    }
	    int sum=0,max=0;
	    // Print the indices where b[i]=0
	    for(int i = arr[0]; i <= arr[N-1]; i++)
	    {
	        if (b[i] == 0)
	        {   
	        	sum+=i;
	        	if (i>max)
	        			max=i;
	            System.out.print(i + " ");
	        }
	        
	    }System.out.println("sum "+sum+" max"+max);
	}
	 
	// Driver Code
	public static void main (String[] args)
	{
	     
	    // Given array arr[]
	    int arr[] = { 6, 7, 10, 11, 13 };
	     
	    int N = arr.length;
	     
	    // Function call
	    printMissingElements(arr, N);
	}
}
	
