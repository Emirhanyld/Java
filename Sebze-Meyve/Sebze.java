public class Sebze extends Yiyecek {
	
	public Sebze(String isim, String renk) {
		super(isim, renk, "Toprak");
	}

	@Override
	public String yiyecekTuru() {
		return "Sebze";
	}
}