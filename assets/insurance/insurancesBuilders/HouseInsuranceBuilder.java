package task1.assets.insurance.insurancesBuilders;


import task1.data.InsuranceData;

public class HouseInsuranceBuilder extends InsuranceBuilder {
    @Override
    public void buildInsurance() {
        insurance.setName(InsuranceData.HouseInsurance.getName());
        insurance.setRisk(InsuranceData.HouseInsurance.getRisk());
        insurance.setPrice(InsuranceData.HouseInsurance.getPrice());
    }
}
