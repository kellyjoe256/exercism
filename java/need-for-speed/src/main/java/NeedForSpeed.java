class NeedForSpeed {

    private final int speed;

    private final int batteryDrain;

    private int distanceDriven;

    private int batteryPercentage = 100;

    public NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {
        return batteryPercentage == 0;
    }

    public int distanceDriven() {
        return distanceDriven;
    }

    public void drive() {
        if (batteryDrained()) {
            return;
        }

        distanceDriven += speed;
        batteryPercentage -= batteryDrain;
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }
}

class RaceTrack {

    private int distance;

    public RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean tryFinishTrack(NeedForSpeed car) {
        while (!car.batteryDrained()) {
            car.drive();
            if (car.distanceDriven() >= distance) {
                break;
            }
        }

        return car.distanceDriven() == distance || ! car.batteryDrained();
    }
}
