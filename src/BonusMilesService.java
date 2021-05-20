public class BonusMilesService {
    public int calculate(int cost){

        int mile = 1; // бонус в милях
        int mileBonus = 20; // бонус за каждые 20 рублей

        int totalMiles = ((cost / mileBonus) * mile); // всего милей от стоимости билета
        return totalMiles;

    }
}