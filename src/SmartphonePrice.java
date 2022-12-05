import java.util.Objects;

public class SmartphonePrice implements Cloneable{

    public String priceType;
    public double priceInEuros;

    public SmartphonePrice(String type, double price){
        priceType = type;
        priceInEuros = price;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        SmartphonePrice priceCloned = (SmartphonePrice) super.clone();
        return priceCloned;
    }

    @Override
    public String toString() {
        return priceType + Double.toString(priceInEuros);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SmartphonePrice that = (SmartphonePrice) o;
        return Double.compare(that.priceInEuros, priceInEuros) == 0 && priceType.equals(that.priceType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(priceType, priceInEuros);
    }
}
