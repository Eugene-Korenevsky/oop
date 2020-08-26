package task1.search;

import task1.assets.Asset;
import task1.filters.FilterInsurance;

import java.text.NumberFormat;
import java.util.ArrayList;

public class SearchInsuranceByThreeParameters implements Search {
    private NumberFormat numberFormat;
    private FilterInsurance filterInsurance1;
    private FilterInsurance filterInsurance2;
    private FilterInsurance filterInsurance3;
    private ArrayList arrayList1 = new ArrayList<>();

    public SearchInsuranceByThreeParameters(FilterInsurance filterInsurance1, FilterInsurance filterInsurance2,
                                            FilterInsurance filterInsurance3, NumberFormat numberFormat) {
        this.filterInsurance1 = filterInsurance1;
        this.filterInsurance2 = filterInsurance2;
        this.filterInsurance3 = filterInsurance3;
        this.numberFormat = numberFormat;
    }

    @Override
    public ArrayList search(ArrayList<Asset> arrayList) {
        for (Asset s : arrayList) {
            if (filterInsurance1.filterOut(s) && filterInsurance2.filterOut(s) && filterInsurance3.filterOut(s))
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
