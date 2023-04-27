import java.time.LocalDate;
import java.time.LocalDateTime;

public class Gigasecond {

    private static final int GIGASECOND = 1_000_000_000;

    private final LocalDateTime dateTime;

    public Gigasecond(LocalDate moment) {
        this(moment.atStartOfDay());
    }

    public Gigasecond(LocalDateTime moment) {
        dateTime = moment.plusSeconds(GIGASECOND);
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }
}
