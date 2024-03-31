import java.util.Random;

public class Tavsan {
	int kare = 1, randomSayi;
	Random rand = new Random();
/*
Tavşan
%20-Hareketsiz
%20-9 kare sağa
%10-12 kare sola
%30-1 kare sağa
%20-2 kare sola
*/
	public void hareket() {
		// 1-10 arası rastgele bir sayı
		randomSayi = rand.nextInt(10) + 1;
		if(randomSayi <= 2) // %20 9sağa
			kare += 9;
		else if(randomSayi <= 3) // %10 12sola
			kare = kare <= 12 ? 1: kare-12;
		else if(randomSayi <= 6) // %30 1sağa
			kare++;
		else if(randomSayi <= 8) // %20 2sola
			kare = kare <= 2 ? 1: kare-2;
		// Kalan %20 hareketsiz
	}
}