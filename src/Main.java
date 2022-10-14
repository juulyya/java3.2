public class Main {
    public static void main(String[] args) {
        BmiServise service = new BmiServise();
        double rost = 1.65;
        double massa = 50;
        double bmi = service.calculate(rost, massa);
        System.out.println("Ваш индекс массы тела:" + bmi);
    }
}