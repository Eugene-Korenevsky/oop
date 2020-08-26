package task1.filters;

import task1.assets.Asset;

public class FilterInsuranceByPrice implements FilterInsurance {
    private double firstPrice;
    private double secondPrice;

    public FilterInsuranceByPrice(double firstPrice, double secondPrice) {
        this.firstPrice = firstPrice;
        this.secondPrice = secondPrice;
    }

    @Override
    public boolean filterOut(Asset insurance) {
        return (secondPrice >= insurance.getPrice() && firstPrice <= insurance.getPrice());
    }
}
