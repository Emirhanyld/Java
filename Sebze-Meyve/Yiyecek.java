public abstract class Yiyecek {
	private String isim, renk, yetistigiYer;

	public Yiyecek(String isim, String renk, String yetistigiYer) {
		this.isim = isim;
		this.renk = renk;
		this.yetistigiYer = yetistigiYer;
	}

	public void set(String isim, String renk, String yetistigiYer) {
		this.isim = isim;
		this.renk = renk;
		this.yetistigiYer = yetistigiYer;
	}

	public void set(String isim, String renk) {
		this.isim = isim;
		this.renk = renk;
	}

	public String getIsim() {
		return isim;
	}

	public String getRenk() {
		return renk;
	}

	public String getYetistigiYer() {
		return yetistigiYer;
	}

	public String yiyecekTuru() {
		return "Belirsiz";
	}
}