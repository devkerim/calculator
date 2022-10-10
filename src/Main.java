import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int select,sayi1,sayi2;
	Scanner intscanner = new Scanner(System.in);


	System.out.print("Birinci sayıyı giriniz: ");
	sayi1 = intscanner.nextInt();
	System.out.print("İkinci sayıyı giriniz: ");
	sayi2 = intscanner.nextInt();
	System.out.print("İşlem seçiniz: ");
	System.out.print("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
	select = intscanner.nextInt();

    if(select==4&&sayi2==0){System.out.println("Bir sayı 0'a bölünemeaz");}
    else {

        switch (select) {
            case 1:
                System.out.println("Toplam: "+(sayi1 + sayi2));
                break;
            case 2:
                System.out.println("Çıkarma: "+(sayi1 - sayi2));
                break;
            case 3:
                System.out.println("Çarpma: "+(sayi1 * sayi2));
                break;
            case 4:
                System.out.println("Bölme: "+(sayi1 / sayi2));
                break;
            default:
                System.out.println("Yanlış seçim yaptınız tekrar deneyiniz!"); }
        }

    }

}



