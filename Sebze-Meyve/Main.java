public class Main {
	public static void main(String[] args) {
		Sebze kirmiziLahana = new Sebze("Kirmizi Lahana", "Kirmizi");
		Meyve yesilElma = new Meyve("Yesil Elma", "Yesil");

		System.out.println(kirmiziLahana.getYetistigiYer());
		System.out.println(yesilElma.getYetistigiYer());

		yazdir(kirmiziLahana);
		yazdir(yesilElma);
	}

	public static void yazdir(Yiyecek yiyecek) {
		if(yiyecek.yiyecekTuru().equals("Meyve"))
			System.out.println(yiyecek.getIsim() + " bir mevyedir.");
		else if(yiyecek.yiyecekTuru().equals("Sebze"))
			System.out.println(yiyecek.getIsim() + " bir sebzedir.");
	}
}