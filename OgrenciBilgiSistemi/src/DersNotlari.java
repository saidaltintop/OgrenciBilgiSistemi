
public class DersNotlari {//dersleri ayrı ayrı tutmamın nedeni isteğimiz zaman istediğimiz derslerin hepsini alabilmek.örnegin tum ögrencilerin fizik notlarını almak gibi.
	private int Fizik;
	private int Kimya;
	private int Biyoloji;
	private int Matematik;
	private int Geometri;
	private int Edebiyat;
	private int DilveAnlatım;
	private int Tarih;
	private int Cografya;
	private int Felsefe;
	
	public void SayisalDersNotlari(int fizik, int kimya, int biyoloji, int matematik,
			int geometri, int edebiyat, int dilveAnlatım) {
		Fizik = fizik;
		Kimya = kimya;
		Biyoloji = biyoloji;
		Matematik = matematik;
		Geometri = geometri;
		Edebiyat = edebiyat;
		DilveAnlatım = dilveAnlatım;
	}

	public void EsitAgirlikDersNotlari(int matematik, int geometri, int edebiyat,
			int dilveAnlatım, int tarih, int cografya, int felsefe) {
		Matematik = matematik;
		Geometri = geometri;
		Edebiyat = edebiyat;
		DilveAnlatım = dilveAnlatım;
		Tarih = tarih;
		Cografya = cografya;
		Felsefe = felsefe;
	}

	public String DersNotBilgileri()
	{
		return "\nFizik : "+Fizik+"\nKimya : "+Kimya+"\nBiyoloji : "+Biyoloji+"\nMatematik : "+Matematik+"\nGeometri : "+Geometri+"\nEdebiyat : "+Edebiyat+"\nDil ve Anlatım : "+DilveAnlatım+"\nFelsefe : "+Felsefe+"\nTarih : "+Tarih+"\nCoğrafya : "+Cografya;
	}

	public int getFizik() {
		return Fizik;
	}

	public void setFizik(int fizik) {
		Fizik = fizik;
	}

	public int getKimya() {
		return Kimya;
	}

	public void setKimya(int kimya) {
		Kimya = kimya;
	}

	public int getBiyoloji() {
		return Biyoloji;
	}

	public void setBiyoloji(int biyoloji) {
		Biyoloji = biyoloji;
	}

	public int getMatematik() {
		return Matematik;
	}

	public void setMatematik(int matematik) {
		Matematik = matematik;
	}

	public int getGeometri() {
		return Geometri;
	}

	public void setGeometri(int geometri) {
		Geometri = geometri;
	}

	public int getEdebiyat() {
		return Edebiyat;
	}

	public void setEdebiyat(int edebiyat) {
		Edebiyat = edebiyat;
	}

	public int getDilveAnlatım() {
		return DilveAnlatım;
	}

	public void setDilveAnlatım(int dilveAnlatım) {
		DilveAnlatım = dilveAnlatım;
	}

	public int getTarih() {
		return Tarih;
	}

	public void setTarih(int tarih) {
		Tarih = tarih;
	}

	public int getCografya() {
		return Cografya;
	}

	public void setCografya(int cografya) {
		Cografya = cografya;
	}

	public int getFelsefe() {
		return Felsefe;
	}

	public void setFelsefe(int felsefe) {
		Felsefe = felsefe;
	}
		
}
