/**
 * @author Kelly Joseph Wafukho
 * @see https://learnersbucket.com/examples/algorithms/difference-between-square-of-sum-of-numbers-and-sum-of-square-of-numbers/
 */
class DifferenceOfSquaresCalculator {

    int computeSquareOfSumTo(int input) {
        var sum = (input * (input + 1)) / 2;

        return sum * sum;
    }

    int computeSumOfSquaresTo(int input) {
        return (input * (input + 1) * ((input * 2) + 1)) / 6;
    }

    int computeDifferenceOfSquares(int input) {
        return computeSquareOfSumTo(input) - computeSumOfSquaresTo(input);
    }
}
