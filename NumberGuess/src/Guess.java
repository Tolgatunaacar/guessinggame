import java.util.Random;
import java.util.Scanner;

public class Guess {

    
    public static void main(String[] args) {
        game();
    }




    public static void game(){
        Scanner input = new Scanner(System.in);

        Random random= new Random();
        int sayi = random.nextInt(100);

        int tahminHakkı = 5;
        int tahminsayisi = 1;
        boolean isMistake = false;

        System.out.println(sayi);

        while (tahminHakkı > 0) {
            System.out.println(tahminsayisi + ". tahmininiz:");
            int guess = input.nextInt();


            if (guess < 0 || guess > 100){
                System.out.println("0-100 arasında bir sayı girin...");
                if (isMistake){
                    tahminHakkı--;
                    System.out.println("Cok fazla hatali deger girdiniz tahmin sayiniz dusuruldu. Kalan hakkiniz:"+tahminHakkı);
                }
                isMistake = true;
                continue;
            }

            tahminsayisi += 1;

            if (guess == sayi) {
                System.out.println("Kazandiniz...");
                break;
            } else {
                System.out.println("Yanlis tahmin ettiniz...");
                if (guess < sayi){
                    System.out.println("Girdiginiz deger gizli sayidan kucuk...");
                } else
                    System.out.println("Girdiginiz deger gizli sayidan buyuk...");
                System.out.println("Kalan hakkiniz:"+(tahminHakkı-1));
            }
            tahminHakkı--;
        }

        System.out.println("Oyuna yeniden baslamak ister misiniz..."+"1.evet"+"2.hayir");
        int tercih = input.nextInt();
        switch (tercih){
            case 1:
                game();
            case 2:
                System.out.println("Gelecek sefer görüsmek üzere...");
        }
    }
}
