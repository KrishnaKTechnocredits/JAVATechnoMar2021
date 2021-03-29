package komal;
class Example19{
	
	void popularResult(int mark){
		if(mark >= 90){
			System.out.println("you are doing very good");
		}else if(mark <=80 && mark > 70){
			System.out.println("you are doing good");
		}else if(mark <=70 && mark > 60){
			System.out.println("you can do better");
		}else{
			System.out.println("We need more practice");
		}
	}
	public static void main(String[] a){
		Example19 example19 = new Example19();
			example19.popularResult(93);
			example19.popularResult(67);
			example19.popularResult(57);
	}
}	
		
	