package amrutaM.arrayAssignments;

/*program 1 : 
From given array find out count of visible trees. [if question is not clear, please watch recording.] 
int[] treeHeights = {3,5,5,11,9,10,15,14}; 
output : 4*/
public class Assignment16VisibleTrees {

	void countVisibleTrees(int[] treeHeights) {
		int max = 0;
		int visibleTreeCount =0;
		for(int index=0;index<treeHeights.length;index++) {
			if(treeHeights[index]>max) {
				visibleTreeCount++;
				max = treeHeights[index];
			}
		}
		System.out.println(visibleTreeCount);
	}

	public static void main(String[] args) {
		int[] treeHeights = { 3, 5, 5, 11, 9, 10, 15, 14 };
		Assignment16VisibleTrees assignment16VisibleTrees = new Assignment16VisibleTrees();
		assignment16VisibleTrees.countVisibleTrees(treeHeights);

	}
}
