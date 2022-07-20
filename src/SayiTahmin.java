import javax.swing.plaf.IconUIResource;
import java.util.Arrays;
import java.util.Scanner;

public class SayiTahmin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = (int) (Math.random() * 100);
        int[] hatali = new int[5];
        int hak = 0;
        int secilen;
        boolean isWrong = false;
        boolean isWin = false;
        while (hak < 5) {
            System.out.println("Bir sayi giriniz : ");
            secilen = input.nextInt();
            if (secilen < 0 || secilen > 99) {
                System.out.println("Lutfen 0 ile 100 arasinda bir deger giriniz!");
                if (isWrong) {
                    hak++;
                    System.out.println("Hatali sayi girisi yaptiniz, lutfen tekrar deneyiniz");
                    System.out.println("Kalan hak sayisi : " + (5 - hak));

                } else {
                    isWrong = true;
                    System.out.println("Hatali sayi girisi yaptiniz, lutfen tekrar deneyiniz");
                    System.out.println("Bir sonraki hatada hakkinizdan dusecektir");
                }
                continue;
            }
            if (secilen == number) {
                System.out.println("Tebrikler, gizli sayiyi buldunuz!\n" + "Gizli sayi : " + number);
                isWin = true;
                break;
            } else {
                System.out.println("Sayiyi bulamadiniz");
                if (secilen > number) {
                    System.out.println("Secilen sayi gizli sayidan buyuktur.");
                } else {
                    System.out.println("Secilen sayi gizli sayidan kucuktur");
                }
                hatali[hak++] = secilen;
                System.out.println("Kalan hak : " + (5 - hak));
            }


        }
        if (!isWin) {
            System.out.println("Kaybettiniz!");
            if (!isWrong) {
                System.out.println("Tahminleriniz : " + Arrays.toString(hatali));
                System.out.println("Gizli sayi : " + number);
            }
        }
    }
}
