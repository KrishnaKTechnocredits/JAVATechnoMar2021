package technocredits;

// 1. if else
// 2. if else ladder
// 3. seperate if block

public class Shopkeeper {

	int panipuriQ; // 0
	int khakhraQ; // 0

	void setinitialQ(int panipuri, int khakhra) {
		panipuriQ = panipuri;
		khakhraQ = khakhra;
	}

	void requestedQ(int reqPanipuri, int reqKhakhra, boolean pAllowedStatus) { // 0 ,

		if (reqKhakhra > 0) {
			if (khakhraQ > 0) {
				if (reqPanipuri <= panipuriQ) {
					panipuriQ = panipuriQ - reqPanipuri;
				} else {
					System.out.println("Sorry, not sufficient Q. We can give you " + panipuriQ);
					System.out.println("Panipuri actual Q is " + panipuriQ + " and requested Q is " + reqPanipuri
							+ ", couldn't serve demand");
					if (pAllowedStatus) {
						panipuriQ = 0;
					}
				}
			}

			if (panipuriQ == 0)
				System.out.println("Panipuri is outofstock");
			else if (reqPanipuri <= panipuriQ) {
				panipuriQ = panipuriQ - reqPanipuri;
			} else {
				System.out.println("Sorry, not sufficient Q. We can give you " + panipuriQ);
				if (pAllowedStatus) {
					panipuriQ = 0;
				}
			}

			if (reqKhakhra <= khakhraQ) {
				khakhraQ = khakhraQ - reqKhakhra;
			} else {
				System.out.println("Khakhra actual Q is " + khakhraQ + " and requested Q is " + reqKhakhra
						+ ", couldn't serve demand");
			}
		}
	}

	void displayQ() {
		System.out.println("panipuri remaining Q : " + panipuriQ);
		System.out.println("Khakhra remaining Q : " + khakhraQ);
	}

	public static void main(String[] args) {
		Shopkeeper shopkeeper = new Shopkeeper();
		shopkeeper.setinitialQ(30, 40);
		shopkeeper.displayQ(); // 30 40
		shopkeeper.requestedQ(21, 32, true); // true = PAllowed , false = "PNotAllowed"
		shopkeeper.displayQ(); // 9 8
	}
}
