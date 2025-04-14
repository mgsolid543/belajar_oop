package pilar_oop.abstraction;

// Kelas abstrak yang mendefinisikan antarmuka umum
abstract class Hewan {
    abstract void suara();  // Metode abstrak
}

class Kucing extends Hewan {
    @Override
    void suara() {
        System.out.println("Meow");
    }
}

class Anjing extends Hewan {
    @Override
    void suara() {
        System.out.println("Bark");
    }
}

class KucingLain extends Hewan {
    @Override
    void suara() {
        System.out.println("Meow from KucingLain");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Hewan kucing = new Kucing(); // Polimorfisme dengan objek kelas turunan
        Hewan anjing = new Anjing();

        kucing.suara();  // Output: Meow
        anjing.suara();  // Output: Bark
    }
}
