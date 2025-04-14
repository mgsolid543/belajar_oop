package paradigma_program.imperative;

public class Imperative {
    public static void main(String[] args) {
        int n = 10;
        int total = 0;
        for (int i = 1; i <= n; i++) {
            total += i;  // Langkah-langkah untuk menghitung jumlah
        }
        System.out.println("Total: " + total);  // Output: 55
    }
}
