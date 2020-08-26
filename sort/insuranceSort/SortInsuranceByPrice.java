package task1.sort.insuranceSort;


import task1.sort.Sort;

import java.util.ArrayList;
import java.util.Comparator;

public class SortInsuranceByPrice implements Sort {
    private Comparator comparator;

    public SortInsuranceByPrice(Comparator comparator) {
        this.comparator = comparator;
    }

    @Override
    public ArrayList sort(ArrayList arrayList) {
        arrayList.sort(comparator);
        return arrayList;
    }

}
