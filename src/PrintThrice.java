import java.util.Scanner;

public class PrintThrice {
    public static void main(String[] args) {
        printThreeTimes();

    }
    //access modifier//return type

    public static void printThreeTimes() {
        Scanner scanner = new Scanner(System.in);

        //Once mesaji yazdiracagiz

        System.out.println(" Give a word : ");


        //Kullanicinin girdigi degeri bir tane degiskene atayacagiz
        String userInput = scanner.next();

        //for loop - kac kere calisacagini biliyoruz
        for (int counter = 500; counter < 503; counter++) {// 0'dan basladigi icin 3 kere yaıyor indexte, kucuk esit 3 olsaydı 4 kere yazdirirdi
            //1.step counter = 500 +
            //2.step counter = 501 +
            //3.step counter = 502 +
            //4.step counter = 503 +

            //her  seferinde kullanicinin girdigi degeri ekrana yazsin
            System.out.print(userInput);
        }
    }
}
/*
Iki step var
1.Metodu tanimlamak

2.Metodu cagirmak

Write a method, that reads a string
from the user and then prints it three times.

Give a word : cake

cakecakecake

// pseucode

Scanner kullanicaz - Userden input almak icin -
Scanner (System.in) - > keyboard girilen degeri almak istedigimiz
Once mesaji yazdiracagiz - Give q word:
 */
