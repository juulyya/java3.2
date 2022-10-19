public class BmiServise {
    public double calculate(double growth, double weight) {
        double bmi = weight / (growth * growth);
        return bmi;
    }
}
