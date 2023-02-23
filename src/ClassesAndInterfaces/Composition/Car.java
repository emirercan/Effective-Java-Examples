package ClassesAndInterfaces.Composition;

public class Car {
    private Engine engine;
    private Wheel[] wheels;
    private String make;
    private String model;

    public Car(Engine engine, Wheel[] wheels, String make, String model) {
        this.engine = engine;
        this.wheels = wheels;
        this.make = make;
        this.model = model;
    }

    public void start() {
        engine.start();
    }

    public void stop() {
        engine.stop();
    }

    // Getters and setters for all properties

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Wheel[] getWheels() {
        return wheels;
    }

    public void setWheels(Wheel[] wheels) {
        this.wheels = wheels;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}

