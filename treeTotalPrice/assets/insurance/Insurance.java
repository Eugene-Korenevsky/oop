package task1.assets.insurance;


import task1.assets.Asset;

public class Insurance implements Asset {
    private String name;
    private int risk;
    private double price;

    public void setName(String name) {
        this.name = name;
    }

    public void setRisk(int risk) {
        this.risk = risk;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getRisk() {
        return risk;
    }

    public double getPrice() {
        return price;
    }

}
