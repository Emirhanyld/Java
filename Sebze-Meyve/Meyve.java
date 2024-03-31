public class Meyve extends Yiyecek {

	public Meyve(String isim, String renk) {
		super(isim, renk, "Agac");
	}

	@Override
	public String yiyecekTuru() {
		return "Meyve";
	}
}