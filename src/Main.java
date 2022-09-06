public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 100;
        double growth = 1.78;
        double index = service.calculate(weight, growth);
        System.out.println("Ваш индекс равен " + index);
    }
}