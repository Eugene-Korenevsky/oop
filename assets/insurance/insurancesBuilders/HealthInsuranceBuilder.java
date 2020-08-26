package task1.assets.insurance.insurancesBuilders;


import task1.data.InsuranceData;

public class HealthInsuranceBuilder extends InsuranceBuilder {
    @Override
    public void buildInsurance() {
        insurance.setPrice(InsuranceData.HealthInsurance.getPrice());
        insurance.setRisk(InsuranceData.HealthInsurance.getRisk());
        insurance.setName(InsuranceData.HealthInsurance.getName());
    }
}
