package tren;

public class old extends tren_bileti{

	public old(String name ,int age) {
		super(name,age);
		
	}

	
	public void show() {
		System.out.println("isim: "+ getname() +" yaş: "+ getage()+ " fiyat: 50 tl "+ " saat: 5 pm ");
	}
}
