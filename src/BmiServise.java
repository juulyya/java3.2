public class BmiServise {
    public double calculate(double rost, double massa) {
        double bmi = massa / (rost * rost);
        return bmi;
    }
}
