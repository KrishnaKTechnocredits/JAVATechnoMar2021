package pravin.CodingExam_1;

public class NumTargetIndices {
	int[] TargetIndex(int[] input, int target) {
		int length = input.length;
		for(int index=0; index<length; index++) {
		for(int newIndex=1; newIndex<length; newIndex++) {
		int temp = input[index];
		temp = temp+input[newIndex];
		