package task1.data;

public enum InsuranceData implements Data {
    LiveInsurance("Live Insurance", 1, 30),
    HouseInsurance("House Insurance", 2, 50.1),
    HealthInsurance("Health Insurance", 3, 100),
    CarInsurance("Car Insurance", 4, 200);
    private String name;
    private int risk;
    private double price;

    InsuranceData(String name, int risk, double price) {
        this.name = name;
        this.price = price;
        this.risk = risk;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setRisk(int risk) {
        this.risk = risk;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRisk() {
        return risk;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getName() {
        return name;
    }
}
