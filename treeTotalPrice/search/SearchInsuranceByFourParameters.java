package task1.search;

import task1.assets.Asset;

import task1.filters.FilterInsurance;

import java.text.NumberFormat;
import java.util.ArrayList;

public class SearchInsuranceByFourParameters implements Search {
    private NumberFormat numberFormat;
    private FilterInsurance filterInsurance1;
    private FilterInsurance filterInsurance2;
    private FilterInsurance filterInsurance3;
    private FilterInsurance filterInsurance4;
    private ArrayList arrayList1 = new ArrayList<>();

    public SearchInsuranceByFourParameters(FilterInsurance filterInsurance1, FilterInsurance filterInsurance2,
                                           FilterInsurance filterInsurance3, FilterInsurance filterInsurance4,
                                           NumberFormat numberFormat) {
        this.filterInsurance1 = filterInsurance1;
        this.filterInsurance2 = filterInsurance2;
        this.filterInsurance3 = filterInsurance3;
        this.filterInsurance4 = filterInsurance4;
        this.numberFormat = numberFormat;
    }

    @Override
    public ArrayList search(ArrayList<Asset> arrayList) {
        for (Asset s : arrayList) {
            if (filterInsurance1.filterOut(s) && filterInsurance2.filterOut(s)
                    && filterInsurance3.filterOut(s) && filterInsurance4.filterOut(s))
                arrayList1.add(s);
        }
        return arrayList1;
    }

    public String toString() {
        String result = "This is search\n";
        if (arrayList1.size() == 0) {
            result += "Insurances not found";
        } else {
            for (Object s : arrayList1) {
                result += " Name : " + ((Asset) s).getName() + " price : " + numberFormat.format(((Asset) s).getPrice())
                        + " risk : " + ((Asset) s).getRisk() + "\n";
            }
        }
        return result;
    }
}
