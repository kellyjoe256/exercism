import java.util.stream.IntStream;

class Scrabble {

    private int score;

    Scrabble(String word) {
        score = IntStream.range(0, word.length())
            .map(index -> getCharacterScore(word.charAt(index)))
            .sum();
    }

    int getScore() {
        return score;
    }

    int getCharacterScore(char character) {
        switch (Character.toUpperCase(character)) {
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
            case 'L':
            case 'N':
            case 'R':
            case 'S':
            case 'T':
                return 1;

            case 'D':
            case 'G':
                return 2;

            case 'B':
            case 'C':
            case 'M':
            case 'P':
                return 3;

            case 'F':
            case 'H':
            case 'V':
            case 'W':
            case 'Y':
                return 4;

            case 'K':
                return 5;

            case 'J':
            case 'X':
                return 8;

            case 'Q':
            case 'Z':
                return 10;

            default:
                return 0;
        }
    }
}
