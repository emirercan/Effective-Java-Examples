package ClassesAndInterfaces.Composition;

public class Wheel {
    private int size;
    private String brand;

    public Wheel(int size, String brand) {
        this.size = size;
        this.brand = brand;
    }

    // Getters and setters for all properties

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
