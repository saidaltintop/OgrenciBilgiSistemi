import java.util.ArrayList;
import javax.swing.JOptionPane; 

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> students=new ArrayList<Student>();//student arraylist i olusturduk. bu sayede istediğimiz kadar yeni ögrenci olusturabilcegiz
		Student s1 = null;
		Adres a1;
		DersNotlari d1 = null;
		int secenek=0;
		boolean hatakontrol;//hatakontrolunu catch e dustugu zaman false oluyor ve false oluncada do while sayesinde tekrardan aynı soruyu sormasını istedgimiz için kullandık
		for(;;){//kullanıcı cıkıs yapasıya kadar döngu devam eder.
			do{
				hatakontrol=true;
				
				try{
					String res=JOptionPane.showInputDialog("1 => Öğrenci Kayıtı\n2 =>Öğrenci Kayıtı Sil\n3 => Tüm Öğrencilerin Bilgileri \n4 =>Aranacak Öğrenci Bilgileri\n5 => Öğrenci Ders notlarını giriniz \n6 => Öğrenci Ders notları\n");
					if (res==null)//bunu yapma nedenim panelde cansel veya kapatma tusuna bastıgımda null olarak girdi alındı saydıgı ve kapanmadan once hata verdiği için yaptım.
						System.exit(-1);
					secenek=Integer.parseInt(res);	
			}catch (Exception e) {
				// TODO: handle exception
				hatakontrol=false;
				JOptionPane.showMessageDialog(null, "Hatalı giriş yaptınız. Lütfen tekrar giriş yapınız!!");
			}
			}while(hatakontrol==false);
			switch (secenek) {
			case 1://ögrenci eklemek için.
				String name=(JOptionPane.showInputDialog("Öğrencinin adini giriniz "));
				String surname=(JOptionPane.showInputDialog("Öğrencinin soyadini giriniz "));
				int schoolnumber=0,no=0;
				do{
					hatakontrol=true;
					try{
					String res=JOptionPane.showInputDialog("Öğrencinin numarasını giriniz ");
					if (res==null)
						System.exit(-1);
					schoolnumber=Integer.parseInt(res);
					for (int kacinciogrenci = 0; kacinciogrenci < students.size(); kacinciogrenci++) {
						if(students.get(kacinciogrenci).getNumber()==schoolnumber)//students arraylistinde daha önce aynı numarada ögrenci var mı diye kontrol eder. 
						{
							JOptionPane.showMessageDialog(null, schoolnumber+" numara başka bir öğrenciye aittir..");
							hatakontrol=false;
						}
					}
				}catch (Exception e) {
					// TODO: handle exception
					hatakontrol=false;
					JOptionPane.showMessageDialog(null, "Hatalı giriş yaptınız. Lütfen tekrar giriş yapınız!!");
				}
				}while(hatakontrol==false);
				String sehir=((JOptionPane.showInputDialog("Öğrencinin aderes bilgilerini giriniz \nŞehir :")));
				String mahalle=((JOptionPane.showInputDialog("Mahalle:")));
				String sokak=((JOptionPane.showInputDialog("Sokak : ")));
				do{
					hatakontrol=true;
					try{
						String res=JOptionPane.showInputDialog("Adres No : ");
						if (res==null)
							System.exit(-1);
						no=Integer.parseInt(res);
				}catch (Exception e) {
					// TODO: handle exception
					hatakontrol=false;
					JOptionPane.showMessageDialog(null, "Hatalı giriş yaptınız. Lütfen tekrar giriş yapınız!!");
				}
				}while(hatakontrol==false);
				a1=new Adres (sehir,mahalle,sokak,no);//kullancıının girdiği adres bilgilerini a1 e atadık.
				s1=new Student(name, surname, schoolnumber, a1);//kullanıcını girdigi ögrenci bilgilerini s1 e atadık
				students.add(s1);//s1 students arraylist imize ekledik
				break;
			case 2://ögrenci silmek için
				String silinecekname=(JOptionPane.showInputDialog("Silinecek Öğrencinin adini giriniz "));
				String silineceksurname=(JOptionPane.showInputDialog("Silinecek Öğrencinin soyadini giriniz "));
				int kontrol=0;
				for (int kacinciogrenci = 0; kacinciogrenci < students.size() ; kacinciogrenci++) {
					if(students.get(kacinciogrenci).getName().equalsIgnoreCase(silinecekname) && students.get(kacinciogrenci).getSurname().equalsIgnoreCase(silineceksurname))
					{
						String sil=JOptionPane.showInputDialog(null, students.get(kacinciogrenci).OgrenciBilgileri()+"\n================================\nSilmek istediğinize emin misiniz?\n Sil : 'E' İptal : 'H '",(kacinciogrenci+1)+". Öğrenci" , 1);
						if(sil.equalsIgnoreCase("e"))
						{
							JOptionPane.showMessageDialog(null, students.get(kacinciogrenci).getName()+" ismindeki öğrenci silindi!!");
							students.remove(kacinciogrenci);
						}
						
						else
							JOptionPane.showMessageDialog(null, students.get(kacinciogrenci).getName()+" ismindeki öğrenci silinmedi!!");
					}
					else
						kontrol++;
				}
				if(students.size()!=1 && kontrol==(students.size()+1))
					JOptionPane.showMessageDialog(null, "Böyle bir öğrenci kayıtlı değildir!!");
				else if(students.size()==1 && kontrol==(students.size()+1))
					JOptionPane.showMessageDialog(null, "Böyle bir öğrenci kayıtlı değildir!!");
			break;
			case 3://tum ögrencilerin bilgisini görmek için.
				for (int kacinciogrenci = 0; kacinciogrenci < students.size() ; kacinciogrenci++) {
					JOptionPane.showMessageDialog(null, students.get(kacinciogrenci).OgrenciBilgileri(),(kacinciogrenci+1)+". Öğrenci" , 1);
				}
				break;
			case 4://ismi ve soyismiyle aragımız bir ogrencinin bilgilerini görmek için. 
				String aranacakname=(JOptionPane.showInputDialog("Aranacak Öğrencinin adini giriniz "));
				String aranacaksurname=(JOptionPane.showInputDialog("Aranacak Öğrencinin soyadini giriniz "));
				int kontrol1=0;
				for (int kacinciogrenci = 0; kacinciogrenci < students.size() ; kacinciogrenci++) {
					if(students.get(kacinciogrenci).getName().equalsIgnoreCase(aranacakname) && students.get(kacinciogrenci).getSurname().equalsIgnoreCase(aranacaksurname))
					{
						JOptionPane.showMessageDialog(null, students.get(kacinciogrenci).OgrenciBilgileri(),(kacinciogrenci+1)+". Öğrenci" , 1);
					}
					else
						kontrol1++;
				}
				if(students.size()!=1 && kontrol1==students.size())
					JOptionPane.showMessageDialog(null, "Böyle bir öğrenci kayıtlı değildir!!");
				else if(students.size()==1 && kontrol1==students.size())
					JOptionPane.showMessageDialog(null, "Böyle bir öğrenci kayıtlı değildir!!");
				break;
			case 5://ismi ve soyismiyle aragımız bir ogrencinin ders bilgilerini girmek için.
				String notugirilecekname=(JOptionPane.showInputDialog("Aranacak Öğrencinin adini giriniz "));
				String notugirileceksurname=(JOptionPane.showInputDialog("Aranacak Öğrencinin soyadini giriniz "));
				int kontrol2=0;
				for (int kacinciogrenci = 0; kacinciogrenci < students.size() ; kacinciogrenci++) {
					if(students.get(kacinciogrenci).getName().equalsIgnoreCase(notugirilecekname) && students.get(kacinciogrenci).getSurname().equalsIgnoreCase(notugirileceksurname))
					{
						String secbolum=(JOptionPane.showInputDialog("Öğrencinin bölümünü seçiniz : \n1 => sayisal \n2 => eşit ağırlık"));
						do
							{
							if(secbolum.equalsIgnoreCase("1"))
							{
								int fiziknotu = 0, kimyanotu= 0, biyolojinotu= 0, matematiknotu= 0, geometrinotu= 0, edebiyatnotu= 0, dilveanlatimnotu= 0;
								do{
									hatakontrol=true;
									try{
										 fiziknotu=Integer.parseInt((JOptionPane.showInputDialog("Öğrencinin fizik notunu giriniz ")));
										 kimyanotu=Integer.parseInt(JOptionPane.showInputDialog("Öğrencinin kimya notunu giriniz "));
										 biyolojinotu=Integer.parseInt(JOptionPane.showInputDialog("Öğrencinin biyoloji notunu giriniz "));
									     matematiknotu=Integer.parseInt(JOptionPane.showInputDialog("Öğrencinin matematik notunu giriniz "));
										 geometrinotu=Integer.parseInt(JOptionPane.showInputDialog("Öğrencinin geometri notunu giriniz "));
										 edebiyatnotu=Integer.parseInt(JOptionPane.showInputDialog("Öğrencinin edebiyat notunu giriniz "));
										 dilveanlatimnotu=Integer.parseInt(JOptionPane.showInputDialog("Öğrencinin dil ve anlatim notunu giriniz "));	
								}catch (Exception e) {
									// TODO: handle exception
									hatakontrol=false;
									JOptionPane.showMessageDialog(null, "Hatalı giriş yaptınız. Lütfen tekrar giriş yapınız!!");
								}
								}while(hatakontrol==false);
								d1=new DersNotlari();
								d1.SayisalDersNotlari(fiziknotu, kimyanotu, biyolojinotu, matematiknotu, geometrinotu, edebiyatnotu, dilveanlatimnotu);
								students.get(kacinciogrenci).setDersnotlari(d1);
							}
							else if(secbolum.equalsIgnoreCase("2"))
							{
								int felsefenotu = 0, tarihnotu= 0, cografyanotu= 0, matematiknotu= 0, geometrinotu= 0, edebiyatnotu= 0, dilveanlatimnotu= 0;
								do{
									hatakontrol=true;
									try{
										 felsefenotu=Integer.parseInt((JOptionPane.showInputDialog("Öğrencinin felsefe notunu giriniz ")));
										 tarihnotu=Integer.parseInt(JOptionPane.showInputDialog("Öğrencinin tarih notunu giriniz "));
										 cografyanotu=Integer.parseInt(JOptionPane.showInputDialog("Öğrencinin coğrafya notunu giriniz "));
										 matematiknotu=Integer.parseInt(JOptionPane.showInputDialog("Öğrencinin matematik notunu giriniz "));
										 geometrinotu=Integer.parseInt(JOptionPane.showInputDialog("Öğrencinin geometri notunu giriniz "));
										 edebiyatnotu=Integer.parseInt(JOptionPane.showInputDialog("Öğrencinin edebiyat notunu giriniz "));
										 dilveanlatimnotu=Integer.parseInt(JOptionPane.showInputDialog("Öğrencinin dil ve anlatim notunu giriniz "));	
								}catch (Exception e) {
									// TODO: handle exception
									hatakontrol=false;
									JOptionPane.showMessageDialog(null, "Hatalı giriş yaptınız. Lütfen tekrar giriş yapınız!!");
								}
								}while(hatakontrol==false);
								d1=new DersNotlari();
								d1.EsitAgirlikDersNotlari(matematiknotu, geometrinotu, edebiyatnotu, dilveanlatimnotu, tarihnotu, cografyanotu, felsefenotu);
								students.get(kacinciogrenci).setDersnotlari(d1);
							}
							else
								JOptionPane.showMessageDialog(null, "Lütfen 1 veya 2 den birini seçiniz..");
							}while(!secbolum.equalsIgnoreCase("1") && !secbolum.equalsIgnoreCase("2"));
					}
					else
						kontrol2++;
				}
				if(students.size()!=1 && kontrol2==students.size())
					JOptionPane.showMessageDialog(null, "Böyle bir öğrenci kayıtlı değildir!!");
				else if(students.size()==1 && kontrol2==students.size())
					JOptionPane.showMessageDialog(null, "Böyle bir öğrenci kayıtlı değildir!!");
				
				break;
			case 6://ismi ve soyismiyle aragımız bir ogrencinin ders bilgilerini görmek için.
				String notuaranacakname=(JOptionPane.showInputDialog("Aranacak Öğrencinin adini giriniz "));
				String notuaranacaksurname=(JOptionPane.showInputDialog("Aranacak Öğrencinin soyadini giriniz "));
				int kontrol3=0;
				for (int kacinciogrenci = 0; kacinciogrenci < students.size() ; kacinciogrenci++) {
					if(students.get(kacinciogrenci).getName().equalsIgnoreCase(notuaranacakname) && students.get(kacinciogrenci).getSurname().equalsIgnoreCase(notuaranacaksurname))
					{
						try{
							JOptionPane.showMessageDialog(null, students.get(kacinciogrenci).OgrenciDersNotBilgileri(),(kacinciogrenci+1)+". Öğrenci" , 1);	
						}
						catch (Exception e) {
							// TODO: handle exception
							JOptionPane.showMessageDialog(null,students.get(kacinciogrenci).getName()+" adlı öğrencinin notları girilmemis..");
						}
					}
					else
						kontrol3++;
				}
				if(students.size()!=1 && kontrol3==students.size())
					JOptionPane.showMessageDialog(null, "Böyle bir öğrenci kayıtlı değildir!!");
				else if(students.size()==1 && kontrol3==students.size())
					JOptionPane.showMessageDialog(null, "Böyle bir öğrenci kayıtlı değildir!!");
				
				break;	
			default:
				JOptionPane.showMessageDialog(null, "Yanlış giriş yaptınız Lütfen tekrar deneyiniz!!");
				break;
			}
		}
		
	}

}
