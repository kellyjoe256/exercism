public class Lasagna {

    private static final int NUMBER_OF_MINUTES_TO_PREPARE_LAYER = 2;

    public int expectedMinutesInOven() {
        return 40;
    }

    public int remainingMinutesInOven(int minutesInOven) {
        return this.expectedMinutesInOven() - minutesInOven;
    }

    public int preparationTimeInMinutes(int numberOfLayers) {
        return numberOfLayers * NUMBER_OF_MINUTES_TO_PREPARE_LAYER;
    }

    public int totalTimeInMinutes(int numberOfLayers, int numberOfMinutesInOven) {
        return this.preparationTimeInMinutes(numberOfLayers) + numberOfMinutesInOven;
    }
}
