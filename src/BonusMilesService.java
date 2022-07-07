public class BonusMilesService {
    public int calculate(int cost) {

        int priceOnBall = 20;
        int ball = cost / priceOnBall;
        return ball;
    }
}
