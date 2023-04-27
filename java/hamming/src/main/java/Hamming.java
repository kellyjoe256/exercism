import java.util.stream.IntStream;

public class Hamming {

    private final int hammingDistance;

    public Hamming(String leftStrand, String rightStrand) {
        if (leftStrand.length() == 0 && rightStrand.length() > 0) {
            throw new IllegalArgumentException("left strand must not be empty.");
        }

        if (rightStrand.length() == 0 && leftStrand.length() > 0) {
            throw new IllegalArgumentException("right strand must not be empty.");
        }

        if (leftStrand.length() != rightStrand.length()) {
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }

        hammingDistance = IntStream.range(0, leftStrand.length())
            .map(index -> (leftStrand.charAt(index) != rightStrand.charAt(index) ? 1 : 0))
            .sum();
    }

    public int getHammingDistance() {
        return hammingDistance;
    }
}
