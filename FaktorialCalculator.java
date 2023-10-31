import java.util.Scanner;

public class FaktorialCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka untuk menghitung faktorial: ");
        int angka = input.nextInt();

        long faktorial = hitungFaktorial(angka);
        System.out.println("Faktorial dari " + angka + " adalah " + faktorial);

        input.close(); // Pastikan untuk menutup Scanner setelah digunakan.
    }

    public static long hitungFaktorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * hitungFaktorial(n - 1);
        }
    }
}
