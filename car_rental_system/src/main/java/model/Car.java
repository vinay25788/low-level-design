package model;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

public class Car {

    private String licensePlate;
    private String name;
    private String model;
    private double pricePerDay;
    private String make;

    private final AtomicInteger version = new AtomicInteger(0);

    public Car(String licensePlate, String name, String model, double pricePerDay, String make)
    {
        this.licensePlate = licensePlate;
        this.name = name;
        this.model = name;
        this.pricePerDay = pricePerDay;
        this.make = make;
    }

    public String getMake()
    {
        return this.make;
    }

    public boolean tryIncrementVersion(int expectedVersion)
    {
        return version.compareAndSet(expectedVersion, expectedVersion+1);
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getName() {
        return name;
    }



    public String getModel() {
        return model;
    }



    public double getPricePerDay() {
        return pricePerDay;
    }



    public AtomicInteger getVersion() {
        return version;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Car car)) return false;
        return Double.compare(pricePerDay, car.pricePerDay) == 0 && Objects.equals(licensePlate, car.licensePlate) && Objects.equals(name, car.name) && Objects.equals(model, car.model) && Objects.equals(version, car.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(licensePlate, name, model, pricePerDay, version);
    }
}
