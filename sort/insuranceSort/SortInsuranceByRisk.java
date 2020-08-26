package task1.sort.insuranceSort;


import task1.sort.Sort;

import java.util.ArrayList;
import java.util.Comparator;

public class SortInsuranceByRisk implements Sort {
    private Comparator comparator;

    public SortInsuranceByRisk(Comparator comparator) {
        this.comparator = comparator;
    }

    @Override
    public ArrayList sort(ArrayList arrayList) {
        // arrayList.sort(Comparator.comparing(Asset::getRisk));
        //arrayList.sort(this::compare);
        arrayList.sort(comparator);
        return arrayList;
    }


}
