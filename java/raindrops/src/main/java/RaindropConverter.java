import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

class RaindropConverter {

    private static final SortedMap<Integer, String> map = new TreeMap<>(Map.of(3, "Pling", 5, "Plang", 7, "Plong"));

    String convert(int number) {
        var output = new StringBuilder("");
        map.forEach((divisor, raindrop) -> {
            if (number % divisor == 0) {
                output.append(raindrop);
            }
        });

        return output.length() == 0 ? Integer.toString(number) : output.toString();
    }

}
