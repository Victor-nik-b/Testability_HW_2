public class Main {
    public static void main(String[] args) {
        // bmi = weight(kg) / (height(m) * height(m))
        System.out.println("Calculating BMI>");
        double height = 1.87;
        double weight = 98;
        BmiService service = new BmiService();
        double bmi = BmiService.calculateBmi(height, weight);
        System.out.println("BMI: " + (int) bmi);

    }
}
