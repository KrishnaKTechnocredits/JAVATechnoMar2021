package rahul_Hiremath;

public class Ass_7 {
	
	int maggieStock = 50;
	int dosaStock = 43;
	int pouchesStock = 39;
	int panipuriStock = 43; 
	int masalasStock = 73;
	
	void items(int maggie, int dosa, int pouches, int panipuri, int masalas)
	{
		maggieStock = maggieStock - maggie;
		if (maggieStock == 0)
			System.out.println("running out of stock");
		dosaStock = dosaStock - dosa;
		pouchesStock = pouchesStock - pouches;
		panipuriStock = panipuriStock - panipuri;
		masalasStock = masalasStock - masalas;
	}
	

}
