import java.util.Random;
import java.util.Scanner;
public class SeedTahmin {
    /*
     * - Bunu yaparken seed degeri nedir ogrenin(Eger rastgele baslangic degeri 1 ise sonrası 5,8,11,17)
     * - Mevcut zaman degerini seed degeri olarak kullanin
     * 2 - Sonra kullaniciya 2 kere tahmin hakki veriyorsub-nuz.
     * 3 - Kullanici dogru tahmin ederse "Bravo bildiniz" seklinde bir mesaj yazarsiniz
     * 4 - Kullanici bilemezse " .... kadar yaklastiniz " diye geri bildirimde bulunacaksiniz
     * 5 - Kullanici - 1 girdigi anda programiniz sona erecek , o zamana kadar surekli yeni
     *
     *  Odev 1 - Yukaridaki soruyu iki for loop ile yapiniz (25 puan)
     *  Odev 2 - Yukaridaki soruyu iki while loop ile yapiniz (25 puan)
     *  Odev 3 - Yukaridaki soruyu iki do-while loop ile yapiniz (25 puan)
     *  Odev 4 - Yukaridaki soruyu bir for loop bir de do - while loop ile yapiniz (25 puan)
     * @param args
     */
    public static void main(String[] args) {

        while (true) {

            Random random = new Random();
            random.setSeed(System.currentTimeMillis());
            int randomNumber = random.nextInt();
            System.out.println(randomNumber);

            boolean continueGame = true;
            int guessRight = 1;
             while ( guessRight >= 0) {
                System.out.println("Lutfen bir sayi giriniz: ");
                Scanner scanner = new Scanner(System.in);
                int userGuess = scanner.nextInt();
                if (userGuess == -1) {
                    continueGame = false;
                    break;
                }
                if (userGuess == randomNumber) {
                    System.out.println("Bravo");
                } else {
                    if (guessRight == 1) {
                        System.out.println(
                            Math.abs(userGuess - randomNumber) +
                                "kadar yaklastiniz."  +
                                "Tekrar tahmin ediniz.");
                    } else {
                        System.out.println("Kaybettiniz.");
                    }
                }
                 guessRight--;
            }
            if(!continueGame) {
                break;
            }
        }
    }
}