package task1.search;

import task1.assets.Asset;
import task1.filters.FilterInsurance;

import java.text.NumberFormat;
import java.util.ArrayList;

public class SearchInsuranceByOneParameter implements Search {
    private NumberFormat numberFormat;
    private FilterInsurance filter;
    private ArrayList arrayList1 = new ArrayList<>();

    public SearchInsuranceByOneParameter(FilterInsurance filter, NumberFormat numberFormat) {
        this.filter = filter;
        this.numberFormat = numberFormat;
    }

    @Override
    public ArrayList search(ArrayList<Asset> arrayList) {
        for (Asset s : arrayList) {
            if (filter.filterOut(s))
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
