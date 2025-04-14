package paradigma_program.procedural;

public class Procedural {

    // Fungsi untuk menghitung jumlah dari 1 sampai n
    public static int sumNumbers(int n) {
        int total = 0;
        for (int i = 1; i <= n; i++) {
            total += i;
        }
        return total;
    }

    public static void main(String[] args) {
        int result = sumNumbers(10);  // Memanggil fungsi/prosedur untuk menghitung jumlah
        System.out.println("Total: " + result);  // Output: 55
    }
}
