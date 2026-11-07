public class BmiService {

    public static double calculateBmi(double height, double weight) {
        double result;
        result = weight / (height * height);
        return result;
    }
}
