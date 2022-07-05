package UsluSayiHesaplama;

import java.util.Scanner;
public class Hesaplama {

    static int exponentialNumber(int x, int y) {

        if (y == 0){
            System.out.println(1);
            return 1;
        } else if (x==0) {
            System.out.println(0);
            return 1;
        }

        int result = 1;
        for (int i = 1; i <= y; i++) {
            result = result * x;
        }
        System.out.println(result);
        return result;
    }
    public static void main (String[]args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Taban sayiyi giriniz 'x': ");
        int x = input.nextInt();
        System.out.print("Ussu giriniz 'y': ");
        int y = input.nextInt();

        exponentialNumber(x, y);
    }
}