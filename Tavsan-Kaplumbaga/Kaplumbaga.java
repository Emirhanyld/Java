import java.util.Random;

public class Kaplumbaga {
	int kare = 1, randomSayi;
	Random rand = new Random();

/*
Kaplumbağa
%50-3 kare sağa
%20-6 kare sola
%30-1 kare sağa
*/
	public void hareket() {
		// 1-10 arası rastgele bir sayı
		randomSayi = rand.nextInt(10) + 1;
		if(randomSayi <= 5) // %50 3sağa
			kare += 3;
		else if(randomSayi <= 7) // %20 6sola
			kare = kare <= 6 ? 1: kare-6;
		else if(randomSayi <= 10) // %30 1sağa
			kare++;

	}
}