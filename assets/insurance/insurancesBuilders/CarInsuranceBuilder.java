package task1.assets.insurance.insurancesBuilders;


import task1.data.InsuranceData;

public class CarInsuranceBuilder extends InsuranceBuilder {
    @Override
    public void buildInsurance() {
        insurance.setRisk(InsuranceData.CarInsurance.getRisk());
        insurance.setName(InsuranceData.CarInsurance.getName());
        insurance.setPrice(InsuranceData.CarInsurance.getPrice());
    }
}
