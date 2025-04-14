class Kucing {
    // Atribut dari class pilar_oop.pilar_oop.Kucing
    String color;   // Warna bulu kucing
    double height;  // Tinggi kucing
    double length;  // Panjang tubuh kucing
    double weight;  // Berat kucing

    // Metode: Playing
    void Playing() {
        System.out.println("The cat is playing!");
    }

    // Metode: Sleeping
    void Sleeping() {
        System.out.println("The cat is sleeping.");
    }

    // Metode: Eating
    void Eating() {
        System.out.println("The cat is eating.");
    }

    // Metode: Purring
    void Purring() {
        System.out.println("The cat is purring.");
    }
}

public class KucingApp {
    public static void main(String[] args) {
        // Membuat objek kucing1 dari class pilar_oop.pilar_oop.Kucing
        Kucing kucing1 = new Kucing();

        // Menetapkan nilai atribut objek kucing1
        kucing1.color = "White";
        kucing1.height = 25.5;
        kucing1.length = 45.0;
        kucing1.weight = 4.5;

        // Memanggil metode dari objek kucing1
        System.out.println("Color of the cat: " + kucing1.color);
        System.out.println("Height of the cat: " + kucing1.height + " cm");
        System.out.println("Length of the cat: " + kucing1.length + " cm");
        System.out.println("Weight of the cat: " + kucing1.weight + " kg");

        // Menjalankan beberapa metode
        kucing1.Playing();  // Output: The cat is playing!
        kucing1.Sleeping(); // Output: The cat is sleeping.
        kucing1.Eating();   // Output: The cat is eating.
        kucing1.Purring();  // Output: The cat is purring.
    }
}

