import java.util.ArrayList;


public class Adres {

	private String sehir;
	private String mahalle;
	private String sokak;
	private int no;

	public Adres()
	{
	}
	public Adres(String sehir,String mahalle,String sokak,int no)
	{
		this.mahalle=mahalle;
		this.sokak=sokak;
		this.sehir=sehir;
		this.no=no;
	}
	
	public String AdresBilgileri()
	{
		return "\n==Öğrencinin İkametkah bilgileri==\nŞehir :" +sehir+"\nMahalle :" +mahalle+"\nSokak :" +sokak+"\nKapı No :" +no;
	}
	public String getSehir() {
		return sehir;
	}
	public void setSehir(String sehir) {
		this.sehir = sehir;
	}
	public String getMahalle() {
		return mahalle;
	}
	public void setMahalle(String mahalle) {
		this.mahalle = mahalle;
	}
	public String getSokak() {
		return sokak;
	}
	public void setSokak(String sokak) {
		this.sokak = sokak;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	
}
