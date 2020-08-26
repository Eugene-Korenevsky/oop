package task1;

import firstLab2Try.locale.MyLocale;
import task1.assets.Asset;
import task1.assets.insurance.insuranceTree.InsuranceTree;
import task1.assets.insurance.insuranceTree.Tree;
import task1.assets.insurance.insurancesBuilders.*;
import task1.filters.FilterInsurance;
import task1.filters.FilterInsuranceByPrice;
import task1.filters.FilterInsuranceByRisk;
import task1.search.Search;
import task1.search.SearchInsuranceByTwoParameters;
import task1.sort.Sort;
import task1.sort.insuranceSort.RiskComparator;
import task1.sort.insuranceSort.SortInsuranceByRisk;
import task1.treeTotalPrice.InsuranceTreeTotalPrice;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        MyLocale myLocale = new MyLocale();
        InsuranceBuilder carInsuranceBuilder = new CarInsuranceBuilder();
        InsuranceBuilder healthInsuranceBuilder = new HealthInsuranceBuilder();
        InsuranceBuilder houseInsuranceBuilder = new HouseInsuranceBuilder();
        InsuranceBuilder liveInsuranceBuilder = new LiveInsuranceBuilder();
        carInsuranceBuilder.buildInsurance();
        healthInsuranceBuilder.buildInsurance();
        houseInsuranceBuilder.buildInsurance();
        liveInsuranceBuilder.buildInsurance();
        Asset carInsurance = carInsuranceBuilder.getInsurance();
        Asset liveInsurance = liveInsuranceBuilder.getInsurance();
        Asset healthInsurance = healthInsuranceBuilder.getInsurance();
        Asset houseInsurance = houseInsuranceBuilder.getInsurance();
        InsuranceTreeTotalPrice insuranceTreeTotalPrice = new InsuranceTreeTotalPrice(myLocale.getNumberFormat());
        Comparator riskComparator = new RiskComparator();
        Sort sortInsuranceByRisk = new SortInsuranceByRisk(riskComparator);
        FilterInsurance filterInsuranceByRisk = new FilterInsuranceByRisk(2, 4);
        FilterInsurance filterInsuranceByPrice = new FilterInsuranceByPrice(50, 1200);
        Search searchInsuranceByTwoParameters = new SearchInsuranceByTwoParameters(filterInsuranceByRisk,
                filterInsuranceByPrice, myLocale.getNumberFormat());
        ArrayList arrayList;
        Tree tree = new InsuranceTree(myLocale.getNumberFormat());

        tree.addAsset(houseInsurance);
        tree.addAsset(carInsurance);
        tree.addAsset(liveInsurance);
        tree.addAsset(healthInsurance);
        arrayList = tree.getTree();
        System.out.println(tree);
        sortInsuranceByRisk.sort(arrayList);
        System.out.println();
        System.out.println(tree);

        searchInsuranceByTwoParameters.search(arrayList);
        System.out.println(searchInsuranceByTwoParameters);
        System.out.println();
        insuranceTreeTotalPrice.getTreeTotalPrice(tree.getTree());
        System.out.println(insuranceTreeTotalPrice);
    }
}
