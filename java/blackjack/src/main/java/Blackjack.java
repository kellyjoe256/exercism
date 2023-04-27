public class Blackjack {

    private static final int BLACK_JACK_TOTAL = 21;

    private static final String STAND = "S";

    private static final String HIT = "H";

    private static final String SPLIT = "P";

    private static final String WIN = "W";

    public int parseCard(String card) {
        switch (card) {
            case "ace":
                return 11;

            case "queen":
            case "jack":
            case "king":
            case "ten":
                return 10;

            case "nine":
                return 9;

            case "eight":
                return 8;

            case "seven":
                return 7;

            case "six":
                return 6;

            case "five":
                return 5;

            case "four":
                return 4;

            case "three":
                return 3;

            case "two":
                return 2;

            case "one":
                return 1;

            default:
                return 0;
        }
    }

    public boolean isBlackjack(String card1, String card2) {
        return parseCard(card1) + parseCard(card2) == BLACK_JACK_TOTAL;
    }

    public String largeHand(boolean isBlackjack, int dealerScore) {
        boolean standAndWait = dealerScore == 11 || dealerScore == 10;
        if (isBlackjack && !standAndWait) {
            return WIN;
        }

        return STAND;
    }

    public String smallHand(int handScore, int dealerScore) {
        if (handScore <= 11 || (handScore >= 12 && handScore <= 16 && dealerScore >= 7)) {
            return HIT;
        }

        return STAND;
    }

    // FirstTurn returns the semi-optimal decision for the first turn, given the cards of the player and the dealer.
    // This function is already implemented and does not need to be edited. It pulls the other functions together in a
    // complete decision tree for the first turn.
    public String firstTurn(String card1, String card2, String dealerCard) {
        int handScore = parseCard(card1) + parseCard(card2);
        int dealerScore = parseCard(dealerCard);

        if (handScore == 22) {
            return SPLIT;
        }

        if (20 < handScore) {
            return largeHand(isBlackjack(card1, card2), dealerScore);
        } else {
            return smallHand(handScore, dealerScore);
        }
    }
}
