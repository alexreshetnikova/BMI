public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float bmi = service.calculate(60, 172);
        System.out.println(bmi);
    }
}

