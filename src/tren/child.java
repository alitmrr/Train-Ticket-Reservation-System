package tren;

public class child extends tren_bileti {
	
	public child(String name ,int age) {
		super(name,age);
		
	}

	
	public void show() {
		System.out.println("isim: "+ getname() +" yaş: "+ getage()+ "fiyat: 70 tl "+ "saat: 5 pm");
	}
}
