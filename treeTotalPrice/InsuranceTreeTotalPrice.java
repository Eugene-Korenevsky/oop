package task1.treeTotalPrice;


import task1.assets.Asset;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;

public class InsuranceTreeTotalPrice implements TreeTotalPrice {
    private NumberFormat numberFormat;
    private double result;

    public InsuranceTreeTotalPrice(NumberFormat numberFormat) {
        this.numberFormat = numberFormat;
    }

    @Override
    public double getTreeTotalPrice(ArrayList<Asset> arrayList) {
        result = 0;
        for (Asset s : arrayList) {
            result += s.getPrice();
        }
        return result;
    }

    public String toString() {
        return "The total price is " + numberFormat.format(result);
    }
}
