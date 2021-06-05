package ravindra_J.coding_exam_19_PatternPrint;

public class Pattern {
	static String str = "GLOBANT";
	public static void main(String[] args) {
		
		Pattern90Degree pd = new Pattern90Degree();
		pd.patternPrinting(str); 
		
		System.out.println();
		
		ReversePattern rp = new ReversePattern();
		rp.revPatternPrinting(str);
		
		ChadhUtaarPattern cup = new ChadhUtaarPattern();
		cup.chadhUtaarPatternPrinting(str);
	}

}
