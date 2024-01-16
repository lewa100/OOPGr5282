package DIP;

public class Car {
    private iPetrolEngine engine;
    public Car(iPetrolEngine engine) {
        this.engine = engine;
    }

    public void start() {
        this.engine.start();
    }
}
