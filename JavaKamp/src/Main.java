
public class Main {

	public static void main(String[] args) {
		//DRY - Don't Repeat Yourself
				//camelCase
				String internetSubeButonu="Ýnternet Þubesi";
				double dolarDun=8.20;
				double dolarBugun=8.20;
				int vade = 36;
				boolean dustuMu=false;
				
				System.out.println(internetSubeButonu);
				
				
				if (dolarBugun<dolarDun) {
					System.out.println("Dolar düþtü resmi");
				}else if (dolarBugun>dolarDun) {
					System.out.println("Dolar yükseldi resmi");
				}else {
					System.out.println("Dolar eþittir resmi");
				}
				
				
				String kredi1="Hýzlý kredi";
				String kredi2="Mutlu emekli kredi";
				String kredi3="Konut kredi";
				String kredi4="Çiftçi kredi";
				String kredi5="Msb kredi";
				String kredi6="Meb kredi";
				
				System.out.println(kredi1);
				System.out.println(kredi2);
				System.out.println(kredi3);
				System.out.println(kredi4);
				System.out.println(kredi5);
				System.out.println(kredi6);
				
				
				String [] krediler={"Hýzlý kredi","Mutlu emekli kredi","Konut kredi","Çiftçi kredi",
						"Msb kredi","Meb kredi"};
				for (String kredi : krediler) {
					System.out.println(kredi);
				}
				
				for (int i = 0; i < krediler.length; i++) {
					System.out.println(krediler[i]);
					
				}
				
				
				int sayi1=10;
				int sayi2=20;
				sayi1=sayi2;
				sayi2=100;
				System.out.println(sayi1);
				
				int[] sayilar1={1,2,3,4,5};
				int[] sayilar2={10,20,30,40,50};		
				sayilar1=sayilar2;
				sayilar2[0]=100;
				System.out.println(sayilar1[0]);
				System.out.println(sayilar2[0]);

	}

}
