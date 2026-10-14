abstract class Vehicle {
    abstract void start();
}

interface ElectricVehicle {

    default void charging() {
        System.out.println("Vehicle is Charging");
    }

    int battery();

    int range();
}


class Nexon extends Vehicle {

    void start() {
        System.out.println("Nexon Started");
    }
}


class Ola extends Vehicle {

    void start() {
        System.out.println("Ola Started");
    }
}


class Tesla extends Nexon implements ElectricVehicle {

    public int battery() {
        return 90;
    }

    public int range() {
        return 500;
    }
}


class ICube extends Ola implements ElectricVehicle {

    public int battery() {
        return 70;
    }

    public int range() {
        return 120;
    }
}

public class Main {

    public static void main(String[] args) {

        Tesla t = new Tesla();

        t.start();
        t.charging();

        System.out.println("Battery: " + t.battery() + "%");
        System.out.println("Range: " + t.range() + " KM");

        System.out.println();

        ICube i = new ICube();

        i.start();
        i.charging();

        System.out.println("Battery: " + i.battery() + "%");
        System.out.println("Range: " + i.range() + " KM");
    }
}