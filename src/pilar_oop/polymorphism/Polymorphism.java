package pilar_oop.polymorphism;

class Hewan {
    void suara() {
        System.out.println("Suara Hewan");
    }
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

public class Polymorphism {
    public static void main(String[] args) {
        Hewan myCat = new Kucing();   // Polimorfisme dinamis
        Hewan myDog = new Anjing();

        myCat.suara();   // Output: Meow
        myDog.suara();   // Output: Bark
    }
}

