public class BonusMilesService {
    public int calculate(int cost) {

        int mileBonus = 20; // бонус за каждые 20 рублей

        int totalMiles = (cost / mileBonus); // всего милей от стоимости билета
        return totalMiles;

    }
}