package task1.assets.insurance.insurancesBuilders;


public abstract class InsuranceBuilder {
    task1.assets.insurance.Insurance insurance = new task1.assets.insurance.Insurance();

    public abstract void buildInsurance();

    public task1.assets.insurance.Insurance getInsurance() {
        return insurance;
    }
}
