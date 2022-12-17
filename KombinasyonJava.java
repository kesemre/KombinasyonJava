import java.util.Scanner;

public class KombinasyonJava {
    public static void main(String[] args) {
        int n, r, totaln = 1, totalr1 = 1, totalr2 = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Kombinasyon C(n,r) = n!/(r!*(n-r)!");
        System.out.print("Lütfen n giriniz: ");
        n = input.nextInt();
        while (true) {
            System.out.print("Lütfen r giriniz: ");
            r = input.nextInt();
            if (r <= n) {
                break;
            } else {
                System.out.println("r n den büyük olamaz");
            }
        }
        for (int i = 1; i <= n; i++) {
            totaln *= i;
        }
        for (int i = 1; i <= r; i++) {
            totalr1 *= i;

        }
        for (int i = 1; i <= n - r; i++) {
            totalr2 *= i;
        }
        System.out.println("Kombinasyon sonucu: " +(totaln/(totalr1*totalr2)));
    }
}