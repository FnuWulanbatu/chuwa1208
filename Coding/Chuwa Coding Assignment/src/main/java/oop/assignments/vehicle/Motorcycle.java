package oop.assignments.vehicle;

public class Motorcycle extends Vehicle {
    private final boolean hasSidecar;

    public Motorcycle(String brand, int speed, boolean hasSidecar) {
        super(brand, speed);
        this.hasSidecar = hasSidecar;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("hasSidecar=" + hasSidecar);
    }
}


