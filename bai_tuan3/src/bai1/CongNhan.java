package bai1;

public class CongNhan extends CanBo{
    private int step;
    private  String trainingIndustry;

    public CongNhan() {
    }

    public CongNhan(int step, String trainingIndustry) {
        this.step = step;
        this.trainingIndustry = trainingIndustry;
    }

    public CongNhan(String name, int yearOfBirth, String sex, String address, int step, String trainingIndustry) {
        super(name, yearOfBirth, sex, address);
        this.step = step;
        this.trainingIndustry = trainingIndustry;
    }

    public int getStep() {
        return step;
    }

    public void setStep(int step) {
        this.step = step;
    }

    public String getTrainingIndustry() {
        return trainingIndustry;
    }

    public void setTrainingIndustry(String trainingIndustry) {
        this.trainingIndustry = trainingIndustry;
    }

    @Override
    public String toString() {
        return "CongNhan{" + super.toString() +
                "step=" + step +
                ", trainingIndustry='" + trainingIndustry + '\'' +
                '}';
    }

    public static void main(String[] args) {
        CanBo cb1=new CongNhan();
        System.out.println(cb1.toString());
    }
}
