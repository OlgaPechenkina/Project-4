public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weightKg = 98;
        double heightMeters = (int) 1.87;
        int index = service.calculate(98, 1.87);
        System.out.println(index);
    }
}
