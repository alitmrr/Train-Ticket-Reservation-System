package tren;

public class adult extends tren_bileti {

	public adult(String name ,int age) {
		super(name,age);
		
	}
	
	
	
	
	
	
	
	public void show() {
		System.out.println("isim: "+ getname() +" ya�: "+ getage()+ " fiyat: 100 tl "+ " saat: 5 pm");
	}

}
