package DIP;

public class Car {
    private iEngine engine;
    public Car(iEngine engine) {
        this.engine = engine;
    }

    public void start() {
        this.engine.start();
    }
}
