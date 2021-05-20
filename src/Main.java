public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int cost = 10_000;
        int totalMiles = service.calculate(cost);
        System.out.println(totalMiles);
    }
}