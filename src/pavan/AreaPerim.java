/*
WAP to find the area and perimeter of Rectangle and circle. 
 */
package pavan;
class AreaPerim{

	void arearec(float len, float wid){
		float arec= len*wid;
		System.out.println ("Area of the reactagle is "+ arec);
	}
	void perirec( float len, float wid){
		float perir= 2*len+2*wid;
		System.out.println("perimeter of Reactangle is "+ perir);
	}

	void areacir(float radius){
		double acir= (3.1416)*(radius*radius);
		System.out.println("area of circle is "+ acir);
	}

	void pericir(float radius){
		double pericircle= (2*3.1416*radius);
		System.out.println("Perimeter of circle is "+ pericircle);
	}
	
	public static void main (String[]args){
		AreaPerim areaPerim= new AreaPerim();
		areaPerim.arearec(2,4);
		areaPerim.perirec(2,4);
		areaPerim.areacir(3);
		areaPerim.pericir(3);
	}	
}