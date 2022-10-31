package tren;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		int arr[],total=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("number of bilet");
		int number = scan.nextInt();
		tren_bileti[] t1=new tren_bileti[number];
		Scanner scan1 = new Scanner(System.in);
		
		
		for(int i=0;i<number;i++) {
		
			
			
		System.out.println("isim gir:");
		
		String a = scan1.nextLine();
		Scanner scan2 = new Scanner(System.in);
		System.out.println("yaþ gir:");
	int b = scan2.nextInt();
	
	if(17 < b && b<65) {
	

				total+=100;
						t1[i] = new adult(a,b);


	}
	else if( b>0 && b<18) {
		total+=70;
		t1[i] = new child(a,b);
		
		}
	else if( b>=65) {
		total+=50;
		t1[i] = new old(a,b);
			
		}
	else {
		t1[i]=new tren_bileti(b);
	}
	
	
	}
		
		for(int i=0;i<number;i++) {
			
			AbstractDatabase t2=new altyazi();
			t2.showinfos();
			
			t1[i].show();
			System.out.println("\n");
			
			
			
		}
	
		System.out.println("total price :"+total +" tl\n");
		AbstractDatabase t2=new altyazi();
		t2.showinfos2();
		
		}
		

		}
