package kangan.assignments.assignment_19;

public class CaseCount {

	String getCaseCount(String str) {
		int upperChCount = 0;
		int lowerChCount = 0;

		for (int index = 0; index < str.length(); index++) {

			if (Character.isUpperCase(str.charAt(index)))
				upperChCount++;

			if (Character.isLowerCase(str.charAt(index)))
				lowerChCount++;
		}

		if (upperChCount > lowerChCount)
			return "Techno";
		else
			return "Credits";

	}
	public static void main(String[] args) {
		CaseCount caseCount = new CaseCount();
		String str1 = caseCount.getCaseCount("TeCHnoSessionS");
		System.out.println(str1);
		
	}
}
