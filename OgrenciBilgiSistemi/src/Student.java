import java.util.ArrayList;
//Ogrenci Ders Not Bilgileri ve Ogrenci Bilgileri bu class da bulunmakdadır.return olarak istedenen bilgileri döndürür. 

public class Student {

	private String name;
	private String surname;
	private int number;
	private Adres adres;
	private DersNotlari dersnotlari;
	public Student(String name2, String surname2, int schoolnumber)
	{
		name=name2;
		surname=surname2;
		number=schoolnumber;
	}
	
	public Student(String name2,String surname2,int schoolnumber,Adres a1)
	{
		this.name=name2;
		this.surname=surname2;
		this.number=schoolnumber;
		this.adres=a1;
	}
	
	public DersNotlari getDersnotlari() {
		return dersnotlari;
	}

	public void setDersnotlari(DersNotlari dersnotlari) {
		this.dersnotlari = dersnotlari;
	}

	public String OgrenciBilgileri()
	{
		return "Öğrencinin Adi : "+name+"\nSoyadi :"+surname+"\nOkul Numarası : "+number+adres.AdresBilgileri();
	}

	public String OgrenciDersNotBilgileri()
	{
		return "Öğrencinin Adi : "+name+"\nSoyadi :"+surname+"\nOkul Numarası : "+number+dersnotlari.DersNotBilgileri();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public Adres getAdres() {
		return adres;
	}

	public void setAdres(Adres adres) {
		this.adres = adres;
	}

}
