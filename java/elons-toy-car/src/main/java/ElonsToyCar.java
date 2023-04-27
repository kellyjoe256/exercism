public class ElonsToyCar {
    private int distanceInMeters;

    private int batteryPercentage;

    public ElonsToyCar(int distanceInMeters, int batteryPercentage) {
        this.distanceInMeters = distanceInMeters;
        this.batteryPercentage = batteryPercentage;
    }

    public ElonsToyCar() {
        this(0, 100);
    }

    public static ElonsToyCar buy() {
        return new ElonsToyCar();
    }

    public String distanceDisplay() {
        return String.format("Driven %d meters", distanceInMeters);
    }

    public String batteryDisplay() {
        return batteryIsEmpty() ? "Battery empty" : String.format("Battery at %d%%", batteryPercentage);
    }

    public void drive() {
        if (batteryIsEmpty()) {
            return;
        }

        distanceInMeters += 20;
        batteryPercentage -= 1;
    }

    private boolean batteryIsEmpty() {
        return batteryPercentage == 0;
    }
}
