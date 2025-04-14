package paradigma_program.functional;

import java.util.stream.IntStream;

public class Functional {
    public static void main(String[] args) {
        int n = 10;
        // Menggunakan Java Stream API untuk menghitung jumlah
        int sum = IntStream.rangeClosed(1, n).sum();
        System.out.println("Total: " + sum);  // Output: 55
    }
}
