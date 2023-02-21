package MethodsCommontoAllObjects.compareTo;

public class Car implements Comparable<Car> {
    private String make;
    private String model;
    private int year;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    @Override
    public int compareTo(Car otherCar) {
        // compare first by year
        int result = Integer.compare(this.year, otherCar.year);
        if (result == 0) {
            // if years are the same, compare by make
            result = this.make.compareTo(otherCar.make);
            if (result == 0) {
                // if makes are the same, compare by model
                result = this.model.compareTo(otherCar.model);
            }
        }

        return result;
    }
}