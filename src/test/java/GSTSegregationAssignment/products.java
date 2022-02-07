package GSTSegregationAssignment;

public class products {
    public String brand;
    public float basePrice;
    public String color;
    public int gstRate;

    public products(String brand, float basePrice, String color, int gstRate) {
        this.brand = brand;
        this.basePrice = basePrice;
        this.color = color;
        this.gstRate = gstRate;
    }

    public String getBrand() {
        return brand;
    }

    public float getBasePrice() {
        return basePrice;
    }

    public String getColor() {
        return color;
    }

    public int getGstRate() {
        return gstRate;
    }
}
