package task1.assets.insurance.insurancesBuilders;


import task1.data.InsuranceData;

public class LiveInsuranceBuilder extends InsuranceBuilder {
    @Override
    public void buildInsurance() {
        insurance.setName(InsuranceData.LiveInsurance.getName());
        insurance.setRisk(InsuranceData.LiveInsurance.getRisk());
        insurance.setPrice(InsuranceData.LiveInsurance.getPrice());
    }
}
