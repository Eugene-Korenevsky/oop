package task1.search;

import task1.assets.Asset;

import java.text.NumberFormat;
import java.util.ArrayList;

public abstract class SearchInsurance implements Search {
    private NumberFormat numberFormat;
    private String result;
    private ArrayList arrayList1;

    public abstract ArrayList search(ArrayList<Asset> arrayList);

    public String toString() {
        result = "This is search\n";
        if (arrayList1.size() == 0) {
            result += "Insurances not found";
        } else {
            for (Object s : arrayList1) {
                result += " Name : " + ((Asset) s).getName() + " price : " + ((Asset) s).getPrice() + " risk : "
                        + ((Asset) s).getRisk() + "\n";
            }
        }
        return result;
    }

}
