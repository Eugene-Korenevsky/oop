package task1.filters;


import task1.assets.Asset;

public class FilterInsuranceByRisk implements FilterInsurance {
    private int firstRisk;
    private int secondRisk;

    public FilterInsuranceByRisk(int firstRisk, int secondRisk) {
        this.firstRisk = firstRisk;
        this.secondRisk = secondRisk;
    }

    @Override
    public boolean filterOut(Asset insurance) {
        return (secondRisk >= insurance.getRisk() && firstRisk <= insurance.getRisk());
    }
}
