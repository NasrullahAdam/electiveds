package za.ac.cput.group2f.NasrullahAdam;

public class Car {
    private String brand;
    private int model;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        return model == car.model;
    }

    @Override
    public int hashCode() { return model; }
}
