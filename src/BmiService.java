public class BmiService {

    public double calculate(double weight, double growth) {
        double result;
        result = (weight / (growth * growth));
        return result;
    }

    ;
}
