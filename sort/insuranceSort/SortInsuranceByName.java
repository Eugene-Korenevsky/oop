package task1.sort.insuranceSort;

import task1.assets.Asset;
import task1.sort.Sort;

import java.util.ArrayList;
import java.util.Comparator;

public class SortInsuranceByName implements Sort {
    @Override
    public ArrayList sort(ArrayList arrayList) {
        arrayList.sort(Comparator.comparing(Asset::getName));
        return arrayList;
    }
}
