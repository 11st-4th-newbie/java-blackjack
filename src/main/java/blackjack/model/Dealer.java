package blackjack.model;

import blackjack.utils.StringUtils;

public class Dealer extends Player{

    public static final int UPPER_BOUND_TO_DRAW = 16;
    private static final String RESULT_STRING_FORMAT = "%s: %d%s %d%s";
    private int winningCount = 0;
    private int losingCount = 0;

    public Dealer(String name) {
        super(name);
    }

    public int getWinningCount() {
        return winningCount;
    }

    public void incrementWinningCount() {
        this.winningCount += 1;
    }

    public int getLosingCount() {
        return losingCount;
    }

    public void incrementLosingCount() {
        this.losingCount += 1;
    }

    @Override
    public String getResult(){
        return String.format(RESULT_STRING_FORMAT,
                name,
                winningCount, StringUtils.WIN,
                losingCount, StringUtils.LOSE);
    }

    @Override
    public String toString() {
        StringBuilder dealerString = new StringBuilder(super.toString());
        cardHand.getCards().forEach(card -> dealerString.append(card.toString()));
        return dealerString.toString();
    }

    public String showOnlyOneCard() {
        StringBuilder dealerString = new StringBuilder(super.toString());
        dealerString.append(cardHand.getCards().get(0).toString());
        return dealerString.toString();
    }
}