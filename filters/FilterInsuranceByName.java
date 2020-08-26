package task1.filters;

import task1.assets.Asset;

public class FilterInsuranceByName implements FilterInsurance {
    private String name;

    public FilterInsuranceByName(String name) {
        this.name = name;
    }

    @Override
    public boolean filterOut(Asset insurance) {
        return name.equalsIgnoreCase(insurance.getName());
    }
}
