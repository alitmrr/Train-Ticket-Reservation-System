package tren;

public class tren_bileti implements Database{
	private int age; 
	private String name;

	public tren_bileti(String name, int age) {
		this.name=name;
		this.age=age;
	}
	public tren_bileti( int age) {
		this("isim ve bilet oluþturulamadý",age);
	}
	


	public void setname(String name) {
		this.name=name;
	}
	public void setage(int age) {
		this.age=age;
	}

	public String getname() {
		return name;
	}
	public int getage() {
		return age;
	}
	public void show() {
		System.out.println(age+" yaþ aralýðýnda deðil bu nedenle " +name);
	}
}
