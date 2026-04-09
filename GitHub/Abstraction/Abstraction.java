interface Vehicle {
    void start();
    void stop();
}

class Car implements Vehicle {
    public void start() {
        System.out.println("Car starts with a key");
    }

    public void stop() {
        System.out.println("Car stops with brakes");
    }
}

class Bike implements Vehicle {
    public void start() {
        System.out.println("Bike starts with a kick");
    }

    public void stop() {
        System.out.println("Bike stops with brakes");
    }
}

public class Abstraction {
    public static void main(String[] args) {

        Car c = new Car();
        c.start();
        c.stop();

        Bike b = new Bike();
        b.start();
        b.stop();
    }
}