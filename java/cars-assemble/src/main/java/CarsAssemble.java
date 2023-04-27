public class CarsAssemble {

    private static final int SLOW_RATE = 221;

    private static final int ONE_MINUTE_IN_SECONDS = 60;

    private static final double TEN_PERCENTAGE = 0.77d;

    private static final double NINE_PERCENTAGE = 0.8d;

    private static final double BETWEEN_FIVE_AND_EIGHT_PERCENTAGE = 0.9d;

    private static final double BETWEEN_ONE_AND_FOUR_PERCENTAGE = 1d;

    public double productionRatePerHour(int speed) {
        int rate = speed * SLOW_RATE;
        if (speed == 10) {
            return TEN_PERCENTAGE * rate;
        }

        if (speed == 9) {
            return NINE_PERCENTAGE * rate;
        }

        if (speed >= 5 && speed <= 8) {
            return BETWEEN_FIVE_AND_EIGHT_PERCENTAGE * rate;
        }

        return BETWEEN_ONE_AND_FOUR_PERCENTAGE * rate;
    }

    public int workingItemsPerMinute(int speed) {
        return (int) (productionRatePerHour(speed) / ONE_MINUTE_IN_SECONDS);
    }
}
