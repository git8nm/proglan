import java.util.Scanner;

/**
 * Program untuk menghitung faktorial dari suatu angka yang diinputkan oleh pengguna.
 */
public class FaktorialCalculator {
    /**
     * Metode utama program.
     *
     * @param args Argumen baris perintah (tidak digunakan dalam program ini).
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka untuk menghitung faktorial: ");
        int angka = input.nextInt();

        long faktorial = hitungFaktorial(angka);
        System.out.println("Faktorial dari " + angka + " adalah " + faktorial);

        input.close(); // Pastikan untuk menutup Scanner setelah digunakan.
    }

    /**
     * Metode untuk menghitung faktorial dari suatu angka.
     *
     * @param n Angka yang akan dihitung faktorialnya.
     * @return Hasil faktorial dari angka yang diberikan.
     */
    public static long hitungFaktorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * hitungFaktorial(n - 1);
        }
    }
}