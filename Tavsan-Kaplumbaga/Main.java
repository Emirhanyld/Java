public class Main {
	public static void main(String[] args) {
		int i;
		Tavsan tavsan = new Tavsan();
		Kaplumbaga kaplumbaga = new Kaplumbaga();

		while(true) {
			tavsan.hareket();
			kaplumbaga.hareket();

			if(tavsan.kare >= 20 && kaplumbaga.kare >=20) {
				System.out.println("Berabere");
				break;
			}
			else if(tavsan.kare >= 20) {
				System.out.println("Tavsan kazandi, yuh!");
				break;
			}
			else if(kaplumbaga.kare >= 20) {
				System.out.println("Kaplumbaga kazandi oley");
				break;
			}


			for(i=1; i <= 20; i++) {
				if(kaplumbaga.kare == i && tavsan.kare == i)
					System.out.print("Ouch ");
				else if(kaplumbaga.kare == i)
					System.out.print("K ");
				else if(tavsan.kare == i)
					System.out.print("T ");
				else
					System.out.print("_ ");
			}

			
			System.out.println("\nTavsan = " + tavsan.kare);
			System.out.println("Kaplumbaga = " + kaplumbaga.kare + "\n");

		}

	}
}