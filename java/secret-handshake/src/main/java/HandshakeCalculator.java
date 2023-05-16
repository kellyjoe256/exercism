import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class HandshakeCalculator {

    List<Signal> calculateHandshake(int number) {
        int numberOfBits = ((Signal.values().length + 1) - 1);
        int initialBit = ((number >> numberOfBits) & 1);
        List<Signal> signals = IntStream.range(0, Signal.values().length)
            .filter(index -> ((number >> index) & 1) == 1)
            .mapToObj(index -> Signal.values()[index])
            .collect(Collectors.toList());
        if (initialBit == 1) {
            Collections.reverse(signals);
        }

        return signals;
    }

}
