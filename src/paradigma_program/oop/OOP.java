package paradigma_program.oop;

class Car {
    private int speed;
    private int fuel;

    public Car(int speed, int fuel) {
        this.speed = speed;
        this.fuel = fuel;
    }

    public void accelerate() {
        if (fuel > 0) {
            speed += 10;
            fuel -= 1;
        } else {
            System.out.println("Fuel is empty!");
        }
    }

    public void brake() {
        if (speed > 0) {
            speed -= 10;
        }
    }

    public void displayStatus() {
        System.out.println("Speed: " + speed + " km/h, Fuel: " + fuel);
    }
}

public class OOP {
    public static void main(String[] args) {
        Car myCar = new Car(0, 0);  // Membuat objek dari kelas paradigma_program.oop.Car
        myCar.accelerate();  // Memanggil metode untuk akselerasi
        myCar.displayStatus();  // Output: Speed: 10 km/h, Fuel: 9
        myCar.brake();  // Memanggil metode untuk pengereman
        myCar.displayStatus();  // Output: Speed: 0 km/h, Fuel: 9
    }
}
