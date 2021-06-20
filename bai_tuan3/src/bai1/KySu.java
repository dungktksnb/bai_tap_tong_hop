package bai1;

public class KySu extends CanBo {
    private String trainingIndustry;

    public KySu(String trainingIndustry) {
        this.trainingIndustry = trainingIndustry;
    }

    public KySu(String name, int yearOfBirth, String sex, String address, String trainingIndustry) {
        super(name, yearOfBirth, sex, address);
        this.trainingIndustry = trainingIndustry;
    }

    public KySu() {
    }

    public String getTrainingIndustry() {
        return trainingIndustry;
    }

    public void setTrainingIndustry(String trainingIndustry) {
        this.trainingIndustry = trainingIndustry;
    }

    @Override
    public String toString() {
        return "KySu{" + super.toString() +
                "trainingIndustry='" + trainingIndustry + '\'' +
                '}';
    }
}
