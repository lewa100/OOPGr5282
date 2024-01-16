package OCP.models;

import OCP.Vehicle;

public class Bus extends Vehicle {
    public Bus(int maxSpeed) {
        super(maxSpeed, "Bus");
    }

    @Override
    public double calculateAllowedSpeed() {
        return getMaxSpeed() * 0.6;
    }
}
