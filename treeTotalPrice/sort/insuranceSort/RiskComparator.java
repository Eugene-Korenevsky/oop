package task1.sort.insuranceSort;

import task1.assets.Asset;

import java.util.Comparator;

public class RiskComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        return (int) (((Asset) o2).getRisk() - ((Asset) o1).getRisk());
    }
}
