import java.util.Objects;

public class Smartphone implements Cloneable{
    private String brandName;
    private String modelName;
    private int batteryMAh;

    SmartphonePrice producerPrice;
    SmartphonePrice retailPrice;


    @Override
    public Smartphone clone() throws CloneNotSupportedException {
        Smartphone clonedSmartphone  = (Smartphone) super.clone();
        clonedSmartphone.producerPrice = producerPrice;
        clonedSmartphone.retailPrice = retailPrice;
        return clonedSmartphone;
    }

    public Smartphone(String brand, String model, int battery, SmartphonePrice prodP, SmartphonePrice retailP){
        brandName = brand;
        modelName = model;
        batteryMAh = battery;
        producerPrice = prodP;
        retailPrice = retailP;

    }

    @Override
    public String toString() {
        return "Smartphone " + brandName + " " + modelName + " " + retailPrice + " " + producerPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Smartphone that = (Smartphone) o;
        return batteryMAh == that.batteryMAh && brandName.equals(that.brandName) && modelName.equals(that.modelName) && producerPrice.equals(that.producerPrice) && retailPrice.equals(that.retailPrice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brandName, modelName, batteryMAh, producerPrice, retailPrice);
    }
}
