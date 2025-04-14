package pilar_oop.encapsulation;

class Kucing {
    // Atribut yang tersembunyi (private)
    private String color;
    private double height;

    // Metode publik untuk mengakses dan mengubah data
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void printInfo() {
        System.out.println("Color: " + color + ", Height: " + height + " cm");
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Kucing myCat = new Kucing();

        myCat.setColor("White");  // Mengubah warna kucing
        myCat.setHeight(25.5);    // Mengubah tinggi kucing
        myCat.printInfo();        // Output: Color: White, Height: 25.5 cm
    }
}
