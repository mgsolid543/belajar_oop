package pilar_oop.inheritance;

class Hewan {
    String jenis;
    void makan() {
        System.out.println("Makan makanan!");
    }
}

class Kucing extends Hewan {
    String breed;

    void bermain() {
        System.out.println("pilar_oop.pilar_oop.abstraction.Kucing bermain bola.");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Kucing myCat = new Kucing();
        myCat.jenis = "Mamalia";
        myCat.breed = "Persian";
        myCat.makan();  // Output: Makan makanan!
        myCat.bermain(); // Output: pilar_oop.pilar_oop.abstraction.Kucing bermain bola.
    }
}
