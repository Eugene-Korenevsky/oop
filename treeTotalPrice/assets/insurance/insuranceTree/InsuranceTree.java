package task1.assets.insurance.insuranceTree;

import task1.assets.Asset;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Iterator;

public class InsuranceTree implements Tree {
    private NumberFormat numberFormat;
    private ArrayList arrayList = new ArrayList<>();

    public InsuranceTree(NumberFormat numberFormat) {
        this.numberFormat = numberFormat;
    }

    @Override
    public ArrayList getTree() {
        return arrayList;
    }

    public void addAsset(Asset asset) {
        arrayList.add(asset);
    }

    public String toString() {
        String result;
        Asset asset;
        Iterator iterator = arrayList.iterator();

        result = "This is tree\n";
        while (iterator.hasNext()) {
            asset = (Asset) iterator.next();
            result += "Name : " + asset.getName() + "; prise : " + numberFormat.format(asset.getPrice()) + "; risk : "
                    + asset.getRisk() + "\n";
        }
        return result;
    }
}
