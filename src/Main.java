public class Main {
    public static void main(String[] args) {
        BmiServise service = new BmiServise();
        double growth = 1.65;
        double weight = 50;
        double bmi = service.calculate(growth, weight);
        System.out.println("Ваш индекс массы тела:" + bmi);
    }
}