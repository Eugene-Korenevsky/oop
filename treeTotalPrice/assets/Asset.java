package task1.assets;

public interface Asset {
    public String getName();

    public int getRisk();

    public double getPrice();

    public void setPrice(double price);

    public void setRisk(int risk);

    public void setName(String name);
}
